package org.jeasy.states.samples.light_mealy;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LightMealy {
    public static void main(String[] args) throws FiniteStateMachineException {
        // Define states for brightness
        State brightnessLow = new State("brightnessLow");
        State brightnessMedium = new State("brightnessMedium");
        State brightnessHigh = new State("brightnessHigh");
        State brightnessOff = new State("brightnessOff");

        // Create a set to hold all states
        Set<State> states = new HashSet<>();
        states.add(brightnessLow);
        states.add(brightnessMedium);
        states.add(brightnessHigh);
        states.add(brightnessOff);

        // Define FSM transitions
        Transition turnOnLight = new TransitionBuilder()
                .name("TurnOnLight")
                .sourceState(brightnessOff)
                .eventType(LightOnEvent.class)
                .eventHandler(new BrightnessLow())
                .targetState(brightnessLow)
                .build();

        Transition turnOffLow = new TransitionBuilder()
                .name("TurnOffLightLow")
                .sourceState(brightnessLow)
                .eventType(LightOffEvent.class)
                .eventHandler(new BrightnessOff())
                .targetState(brightnessOff)
                .build();

        Transition turnOffMedium = new TransitionBuilder()
                .name("TurnOffLightMedium")
                .sourceState(brightnessMedium)
                .eventType(LightOffEvent.class)
                .eventHandler(new BrightnessOff())
                .targetState(brightnessOff)
                .build();

        Transition turnOffHigh = new TransitionBuilder()
                .name("TurnOffLightHigh")
                .sourceState(brightnessHigh)
                .eventType(LightOffEvent.class)
                .eventHandler(new BrightnessOff())
                .targetState(brightnessOff)
                .build();

        // New transitions for increasing brightness
        Transition turnOnMedium = new TransitionBuilder()
                .name("TurnOnMedium")
                .sourceState(brightnessLow)
                .eventType(LightOnEvent.class)
                .eventHandler(new BrightnessMedium())
                .targetState(brightnessMedium)
                .build();

        Transition turnOnHigh = new TransitionBuilder()
                .name("TurnOnHigh")
                .sourceState(brightnessMedium)
                .eventType(LightOnEvent.class)
                .eventHandler(new BrightnessHigh())
                .targetState(brightnessHigh)
                .build();

        // New transition for going from High to Low
        Transition turnDownToLow = new TransitionBuilder()
                .name("TurnDownToLow")
                .sourceState(brightnessHigh)
                .eventType(LightOnEvent.class)
                .eventHandler(new BrightnessLow()) // You may create a new event handler if needed
                .targetState(brightnessLow)
                .build();

        // Build FSM instance
        FiniteStateMachine lightFSM = new FiniteStateMachineBuilder(states, brightnessOff) // Start with the light off
                .registerTransition(turnOnLight)
                .registerTransition(turnOffLow)
                .registerTransition(turnOffMedium)
                .registerTransition(turnOffHigh)
                .registerTransition(turnOnMedium)
                .registerTransition(turnOnHigh)
                .registerTransition(turnDownToLow) // Register the new transition
                .build();

        // Print initial FSM state
        System.out.println("Current light state: " + lightFSM.getCurrentState().getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 'on' to turn on the light, 'off' to turn off, 'exit' to quit.");

        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "on":
                    // Fire event to turn on the light
                    lightFSM.fire(new LightOnEvent());
                    break;
                case "off":
                    // Fire event to turn off the light
                    lightFSM.fire(new LightOffEvent());
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner resource
                    return;
                default:
                    System.out.println("Invalid command. Please type 'on', 'off', or 'exit'.");
                    break;
            }
            // Print current state after each input
            System.out.println("Current light state: " + lightFSM.getCurrentState().getName());
        }
    }
}