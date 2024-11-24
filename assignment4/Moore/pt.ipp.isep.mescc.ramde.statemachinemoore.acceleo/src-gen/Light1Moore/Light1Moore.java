package org.jeasy.states.Light1Moore;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Light1Moore {
    public static void main(String[] args) throws FiniteStateMachineException {
    	State LightOffState = new State("Light Off", "Off");
    	State LightOnDimmedState = new State("Light On - Dimmed", "Dimmed");
    	State LightOnMediumState = new State("Light On - Medium", "Medium");
    	State LightOnBrightState = new State("Light On - Bright", "Bright");
	
		Set<State> states = new HashSet<>();
		states.add(LightOffState);
		states.add(LightOnDimmedState);
		states.add(LightOnMediumState);
		states.add(LightOnBrightState);

	Transition LightOffToLightOnDimmedTransation = new TransitionBuilder()
            .name("Light Off To Light On - Dimmed")
            .sourceState(LightOffState)
            .eventType(OnEvent.class)
            .targetState(LightOnDimmedState)
            .build();
	Transition LightOnDimmedToLightOnMediumTransation = new TransitionBuilder()
            .name("Light On - Dimmed To Light On - Medium")
            .sourceState(LightOnDimmedState)
            .eventType(OnEvent.class)
            .targetState(LightOnMediumState)
            .build();
	Transition LightOnMediumToLightOnBrightTransation = new TransitionBuilder()
            .name("Light On - Medium To Light On - Bright")
            .sourceState(LightOnMediumState)
            .eventType(OnEvent.class)
            .targetState(LightOnBrightState)
            .build();
	Transition LightOnBrightToLightOnDimmedTransation = new TransitionBuilder()
            .name("Light On - Bright To Light On - Dimmed")
            .sourceState(LightOnBrightState)
            .eventType(OnEvent.class)
            .targetState(LightOnDimmedState)
            .build();
	Transition LightOnDimmedToLightOffTransation = new TransitionBuilder()
            .name("Light On - Dimmed To Light Off")
            .sourceState(LightOnDimmedState)
            .eventType(OffEvent.class)
            .targetState(LightOffState)
            .build();
	Transition LightOnMediumToLightOffTransation = new TransitionBuilder()
            .name("Light On - Medium To Light Off")
            .sourceState(LightOnMediumState)
            .eventType(OffEvent.class)
            .targetState(LightOffState)
            .build();
	Transition LightOnBrightToLightOffTransation = new TransitionBuilder()
            .name("Light On - Bright To Light Off")
            .sourceState(LightOnBrightState)
            .eventType(OffEvent.class)
            .targetState(LightOffState)
            .build();

	FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, LightOffState)
		.registerTransition(LightOffToLightOnDimmedTransation)
		.registerTransition(LightOnDimmedToLightOnMediumTransation)
		.registerTransition(LightOnMediumToLightOnBrightTransation)
		.registerTransition(LightOnBrightToLightOnDimmedTransation)
		.registerTransition(LightOnDimmedToLightOffTransation)
		.registerTransition(LightOnMediumToLightOffTransation)
		.registerTransition(LightOnBrightToLightOffTransation)
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
