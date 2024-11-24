package org.jeasy.states.TurnstileMealy;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TurnstileMealy {
    public static void main(String[] args) throws FiniteStateMachineException {
    	State LockedState = new State("Locked");
    	State UnLockedState = new State("Un-Locked");
	
		Set<State> states = new HashSet<>();
		states.add(LockedState);
		states.add(UnLockedState);

	Transition LockedToUnLockedTransation = new TransitionBuilder()
            .name("Locked To Un-Locked")
            .sourceState(LockedState)
            .eventType(CoinEvent.class)
            .eventHandler(new LockedToUnLockedTransationHandler())
            .targetState(UnLockedState)
            .build();
	Transition LockedToLockedTransation = new TransitionBuilder()
            .name("Locked To Locked")
            .sourceState(LockedState)
            .eventType(PushEvent.class)
            .eventHandler(new LockedToLockedTransationHandler())
            .targetState(LockedState)
            .build();
	Transition UnLockedToLockedTransation = new TransitionBuilder()
            .name("Un-Locked To Locked")
            .sourceState(UnLockedState)
            .eventType(PushEvent.class)
            .eventHandler(new UnLockedToLockedTransationHandler())
            .targetState(LockedState)
            .build();
	Transition UnLockedToUnLockedTransation = new TransitionBuilder()
            .name("Un-Locked To Un-Locked")
            .sourceState(UnLockedState)
            .eventType(CoinEvent.class)
            .eventHandler(new UnLockedToUnLockedTransationHandler())
            .targetState(UnLockedState)
            .build();

	FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, LockedState)
		.registerTransition(LockedToUnLockedTransation)
		.registerTransition(LockedToLockedTransation)
		.registerTransition(UnLockedToLockedTransation)
		.registerTransition(UnLockedToUnLockedTransation)
        .build();

        System.out.println("Current state: " + fsm.getCurrentState().getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Instructions: Type the command corresponding to the desired event:");
        System.out.println("  - Type 'push' to trigger the event 'Push'.");
        System.out.println("  - Type 'coin' to trigger the event 'Coin'.");
        System.out.println("  - Type 'exit' to quit.");

        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
				case "push":
			        fsm.fire(new PushEvent());
			        break;
				case "coin":
			        fsm.fire(new CoinEvent());
			        break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner resource
                    return;
                default:
                    System.out.println("Invalid command. Please type one of the commands listed or 'exit' to quit.");
                    break;
            }
            System.out.println("Current state: " + fsm.getCurrentState().getName());
        }

    }
}
