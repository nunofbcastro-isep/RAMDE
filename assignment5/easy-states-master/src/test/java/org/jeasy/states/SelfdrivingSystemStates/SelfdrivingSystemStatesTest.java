package org.jeasy.states.SelfdrivingSystemStates;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;
import org.junit.Test;
import org.junit.Before;
import java.util.HashSet;
import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.jeasy.states.SelfdrivingSystemStates.events.ParkingEvent;
import org.jeasy.states.SelfdrivingSystemStates.events.OffEvent;
import org.jeasy.states.SelfdrivingSystemStates.events.DrivingEvent;
import org.jeasy.states.SelfdrivingSystemStates.events.ErrorEvent;
import org.jeasy.states.SelfdrivingSystemStates.events.DrivertingEvent;
import org.jeasy.states.SelfdrivingSystemStates.handlers.DrivingToObstacleTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ErrorToStandByTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.DrivingToParkingTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.DrivingToErrorTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ObstacleToDrivingTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ObstacleToErrorTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ParkingToErrorTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.StandByToDrivingTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ParkingToStandByTransationHandler;

public class SelfdrivingSystemStatesTest {
	private State StandByState;
	private State ObstacleState;
	private State ErrorState;
	private State DrivingState;
	private State ParkingState;
	private Set<State> states;

	private Transition DrivingToObstacleTransation;
	private Transition ErrorToStandByTransation;
	private Transition DrivingToParkingTransation;
	private Transition DrivingToErrorTransation;
	private Transition ObstacleToDrivingTransation;
	private Transition ObstacleToErrorTransation;
	private Transition ParkingToErrorTransation;
	private Transition StandByToDrivingTransation;
	private Transition ParkingToStandByTransation;

	@Before
	public void setUp() {
		StandByState = new State("StandBy");
		ObstacleState = new State("Obstacle");
		ErrorState = new State("Error");
		DrivingState = new State("Driving");
		ParkingState = new State("Parking");

		states = new HashSet<>();
		states.add(StandByState);
		states.add(ObstacleState);
		states.add(ErrorState);
		states.add(DrivingState);
		states.add(ParkingState);

		DrivingToObstacleTransation = new TransitionBuilder()
				.name("Driving To Obstacle")
				.sourceState(DrivingState)
				.eventType(DrivertingEvent.class)
				.eventHandler(new DrivingToObstacleTransationHandler())
				.targetState(ObstacleState)
				.build();
		ErrorToStandByTransation = new TransitionBuilder()
				.name("Error To StandBy")
				.sourceState(ErrorState)
				.eventType(OffEvent.class)
				.eventHandler(new ErrorToStandByTransationHandler())
				.targetState(StandByState)
				.build();
		DrivingToParkingTransation = new TransitionBuilder()
				.name("Driving To Parking")
				.sourceState(DrivingState)
				.eventType(ParkingEvent.class)
				.eventHandler(new DrivingToParkingTransationHandler())
				.targetState(ParkingState)
				.build();
		DrivingToErrorTransation = new TransitionBuilder()
				.name("Driving To Error")
				.sourceState(DrivingState)
				.eventType(ErrorEvent.class)
				.eventHandler(new DrivingToErrorTransationHandler())
				.targetState(ErrorState)
				.build();
		ObstacleToDrivingTransation = new TransitionBuilder()
				.name("Obstacle To Driving")
				.sourceState(ObstacleState)
				.eventType(DrivingEvent.class)
				.eventHandler(new ObstacleToDrivingTransationHandler())
				.targetState(DrivingState)
				.build();
		ObstacleToErrorTransation = new TransitionBuilder()
				.name("Obstacle To Error")
				.sourceState(ObstacleState)
				.eventType(ErrorEvent.class)
				.eventHandler(new ObstacleToErrorTransationHandler())
				.targetState(ErrorState)
				.build();
		ParkingToErrorTransation = new TransitionBuilder()
				.name("Parking To Error")
				.sourceState(ParkingState)
				.eventType(ErrorEvent.class)
				.eventHandler(new ParkingToErrorTransationHandler())
				.targetState(ErrorState)
				.build();
		StandByToDrivingTransation = new TransitionBuilder()
				.name("StandBy To Driving")
				.sourceState(StandByState)
				.eventType(DrivingEvent.class)
				.eventHandler(new StandByToDrivingTransationHandler())
				.targetState(DrivingState)
				.build();
		ParkingToStandByTransation = new TransitionBuilder()
				.name("Parking To StandBy")
				.sourceState(ParkingState)
				.eventType(OffEvent.class)
				.eventHandler(new ParkingToStandByTransationHandler())
				.targetState(StandByState)
				.build();
	}

	@Test
	public void testRegisterTransition() {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, StandByState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		assertThat(fsm.getTransitions()).contains(
				DrivingToObstacleTransation,
				ErrorToStandByTransation,
				DrivingToParkingTransation,
				DrivingToErrorTransation,
				ObstacleToDrivingTransation,
				ObstacleToErrorTransation,
				ParkingToErrorTransation,
				StandByToDrivingTransation,
				ParkingToStandByTransation
		);
	}

	@Test
	public void testChangeTransitionDrivingToObstacleTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, DrivingState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new DrivertingEvent());

		assertEquals(fsm.getCurrentState(), ObstacleState);
	}

	@Test
	public void testChangeTransitionErrorToStandByTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, ErrorState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new OffEvent());

		assertEquals(fsm.getCurrentState(), StandByState);
	}

	@Test
	public void testChangeTransitionDrivingToParkingTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, DrivingState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new ParkingEvent());

		assertEquals(fsm.getCurrentState(), ParkingState);
	}

	@Test
	public void testChangeTransitionDrivingToErrorTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, DrivingState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new ErrorEvent());

		assertEquals(fsm.getCurrentState(), ErrorState);
	}

	@Test
	public void testChangeTransitionObstacleToDrivingTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, ObstacleState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new DrivingEvent());

		assertEquals(fsm.getCurrentState(), DrivingState);
	}

	@Test
	public void testChangeTransitionObstacleToErrorTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, ObstacleState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new ErrorEvent());

		assertEquals(fsm.getCurrentState(), ErrorState);
	}

	@Test
	public void testChangeTransitionParkingToErrorTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, ParkingState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new ErrorEvent());

		assertEquals(fsm.getCurrentState(), ErrorState);
	}

	@Test
	public void testChangeTransitionStandByToDrivingTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, StandByState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new DrivingEvent());

		assertEquals(fsm.getCurrentState(), DrivingState);
	}

	@Test
	public void testChangeTransitionParkingToStandByTransation()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, ParkingState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new OffEvent());

		assertEquals(fsm.getCurrentState(), StandByState);
	}

	@Test
	public void testChangeTransitionInvalid()  throws FiniteStateMachineException {
		FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, StandByState)
				.registerTransition(DrivingToObstacleTransation)
				.registerTransition(ErrorToStandByTransation)
				.registerTransition(DrivingToParkingTransation)
				.registerTransition(DrivingToErrorTransation)
				.registerTransition(ObstacleToDrivingTransation)
				.registerTransition(ObstacleToErrorTransation)
				.registerTransition(ParkingToErrorTransation)
				.registerTransition(StandByToDrivingTransation)
				.registerTransition(ParkingToStandByTransation)
				.build();

		fsm.fire(new DrivertingEvent());

		assertEquals(fsm.getCurrentState(), StandByState);
	}
}
