/*
 * The MIT License
 *
 *  Copyright (c) 2020, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package org.jeasy.states.core;

import org.jeasy.states.api.AbstractEvent;
import org.jeasy.states.api.EventHandler;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class FiniteStateMachineImplTest {

    private State s1, s2;
    @Mock
    private EventHandler<MoveEvent> eventHandler;
    private FiniteStateMachineImpl stateMachine;

    @Before
    public void setUp() {
        s1 = new State("s1");
        s2 = new State("s2");
        Set<State> states = new HashSet<>();
        states.add(s1);
        states.add(s2);
        stateMachine = new FiniteStateMachineImpl(states, s1);
    }

    @Test
    public void whenEventIsFired_thenShouldTransitToTargetStateAndInvokeEventHandler() throws Exception {
        // Given
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .eventHandler(eventHandler)
                .build();
        stateMachine.registerTransition(transition);

        // When
        MoveEvent event = new MoveEvent();
        stateMachine.fire(event);

        // Then
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s2);
        Mockito.verify(eventHandler).handleEvent(event);
    }

    @Test
    public void whenStateMachineIsInFinalState_thenAnyEventShouldNotChangeItsState() throws Exception {
        // Given
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .eventHandler(eventHandler)
                .build();
        stateMachine.registerFinalState(s1);
        stateMachine.registerTransition(transition);

        // When
        stateMachine.fire(new MoveEvent());

        // Then
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s1);
    }

    @Test
    public void whenFiredEventIsNull_thenShouldNotChangeState() throws Exception {
        // Given
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .eventHandler(eventHandler)
                .build();
        stateMachine.registerTransition(transition);

        // When
        stateMachine.fire(null);

        // Then
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s1);
    }

    @Test(expected = FiniteStateMachineException.class)
    public void whenEventHandlerThrowsException_thenShouldThrowFiniteStateMachineException() throws Exception {
        // Given
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .eventHandler(eventHandler)
                .build();
        stateMachine.registerTransition(transition);
        MoveEvent event = new MoveEvent();
        Exception exception = new Exception("Artificial exception for test");
        doThrow(exception).when(eventHandler).handleEvent(event);


        // When
        stateMachine.fire(event);

        // Then
        // expected exception
    }

    @Test
    public void whenNoRegisteredTransitionForTheFiredEvent_thenShouldNotChangeState() throws Exception {
        // Given
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .eventHandler(eventHandler)
                .build();
        stateMachine.registerTransition(transition);

        // When
        stateMachine.fire(new StayEvent());

        // Then
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s1);
        Mockito.verifyNoInteractions(eventHandler);
    }

    @Test
    public void whenMultipleEventsAreFired_thenShouldTransitToCorrespondingTargetStates() throws Exception {
        // Given
        State s3 = new State("s3");
        Set<State> states = new HashSet<>(Arrays.asList(s1, s2, s3));
        Transition transition1 = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .eventHandler(eventHandler)
                .build();
        Transition transition2 = new TransitionBuilder()
                .sourceState(s2)
                .targetState(s3)
                .eventType(StayEvent.class)
                .build();
        stateMachine.registerTransition(transition1);
        stateMachine.registerTransition(transition2);

        // When
        stateMachine.fire(new MoveEvent());
        stateMachine.fire(new StayEvent());

        // Then
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s3);
    }

    @Test
    public void whenUnregisteredEventIsFired_thenShouldNotChangeState() throws Exception {
        // Given
        Transition transition = new TransitionBuilder()
                .sourceState(s1)
                .targetState(s2)
                .eventType(MoveEvent.class)
                .eventHandler(eventHandler)
                .build();
        stateMachine.registerTransition(transition);

        // When
        stateMachine.fire(new StayEvent()); // Evento StayEvent não registrado para s1 -> s2

        // Then
        Assertions.assertThat(stateMachine.getCurrentState()).isEqualTo(s1);
        Mockito.verifyNoInteractions(eventHandler);
    }

    private static class MoveEvent extends AbstractEvent { }

    private static class StayEvent extends AbstractEvent { }
}
