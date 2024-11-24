package org.jeasy.states.Light2Mealy;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Light2Mealy {
    public static void main(String[] args) throws FiniteStateMachineException {
    	State LightOffState = new State("Light Off");
    	State LightOnState = new State("Light On");
	
		Set<State> states = new HashSet<>();
		states.add(LightOffState);
		states.add(LightOnState);

	Transition LightOffToLightOnTransation = new TransitionBuilder()
            .name("Light Off To Light On")
            .sourceState(LightOffState)
            .eventType(OnEvent.class)
            .eventHandler(new LightOffToLightOnTransationHandler())
            .targetState(LightOnState)
            .build();
	Transition LightOnToLightOffTransation = new TransitionBuilder()
            .name("Light On To Light Off")
            .sourceState(LightOnState)
            .eventType(OffEvent.class)
            .eventHandler(new LightOnToLightOffTransationHandler())
            .targetState(LightOffState)
            .build();
	Transition LightOnToLightOnTransation = new TransitionBuilder()
            .name("Light On To Light On")
            .sourceState(LightOnState)
            .eventType(OnEvent.class)
            .eventHandler(new LightOnToLightOnTransationHandler())
            .targetState(LightOnState)
            .build();

	FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, LightOffState)
		.registerTransition(LightOffToLightOnTransation)
		.registerTransition(LightOnToLightOffTransation)
		.registerTransition(LightOnToLightOnTransation)
        .build();

        System.out.println("Current state: " + fsm.getCurrentState().getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Instructions: Type the command corresponding to the desired event:");
        System.out.println("  - Type 'off' to trigger the event 'Off'.");
        System.out.println("  - Type 'on ' to trigger the event 'On '.");
        System.out.println("  - Type 'exit' to quit.");

        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
				case "off":
			        fsm.fire(new OffEvent());
			        break;
				case "on":
			        fsm.fire(new OnEvent());
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