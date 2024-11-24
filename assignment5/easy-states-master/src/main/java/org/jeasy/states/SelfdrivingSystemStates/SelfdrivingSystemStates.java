package org.jeasy.states.SelfdrivingSystemStates;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;
import org.jeasy.states.SelfdrivingSystemStates.events.DrivingEvent;
import org.jeasy.states.SelfdrivingSystemStates.events.ErrorEvent;
import org.jeasy.states.SelfdrivingSystemStates.events.DrivertingEvent;
import org.jeasy.states.SelfdrivingSystemStates.events.ParkingEvent;
import org.jeasy.states.SelfdrivingSystemStates.events.OffEvent;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ParkingToErrorTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ErrorToStandByTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.DrivingToObstacleTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.DrivingToParkingTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ParkingToStandByTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ObstacleToErrorTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.DrivingToErrorTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.ObstacleToDrivingTransationHandler;
import org.jeasy.states.SelfdrivingSystemStates.handlers.StandByToDrivingTransationHandler;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SelfdrivingSystemStates {
    public static void main(String[] args) throws FiniteStateMachineException {
	State ParkingState = new State("Parking");
	State ErrorState = new State("Error");
	State StandByState = new State("StandBy");
	State DrivingState = new State("Driving");
	State ObstacleState = new State("Obstacle");
	
	Set<State> states = new HashSet<>();
	states.add(ParkingState);
	states.add(ErrorState);
	states.add(StandByState);
	states.add(DrivingState);
	states.add(ObstacleState);

	Transition ParkingToErrorTransation = new TransitionBuilder()
            .name("Parking To Error")
            .sourceState(ParkingState)
            .eventType(ErrorEvent.class)
            .eventHandler(new ParkingToErrorTransationHandler())
            .targetState(ErrorState)
            .build();
	Transition ErrorToStandByTransation = new TransitionBuilder()
            .name("Error To StandBy")
            .sourceState(ErrorState)
            .eventType(OffEvent.class)
            .eventHandler(new ErrorToStandByTransationHandler())
            .targetState(StandByState)
            .build();
	Transition DrivingToObstacleTransation = new TransitionBuilder()
            .name("Driving To Obstacle")
            .sourceState(DrivingState)
            .eventType(DrivertingEvent.class)
            .eventHandler(new DrivingToObstacleTransationHandler())
            .targetState(ObstacleState)
            .build();
	Transition DrivingToParkingTransation = new TransitionBuilder()
            .name("Driving To Parking")
            .sourceState(DrivingState)
            .eventType(ParkingEvent.class)
            .eventHandler(new DrivingToParkingTransationHandler())
            .targetState(ParkingState)
            .build();
	Transition ParkingToStandByTransation = new TransitionBuilder()
            .name("Parking To StandBy")
            .sourceState(ParkingState)
            .eventType(OffEvent.class)
            .eventHandler(new ParkingToStandByTransationHandler())
            .targetState(StandByState)
            .build();
	Transition ObstacleToErrorTransation = new TransitionBuilder()
            .name("Obstacle To Error")
            .sourceState(ObstacleState)
            .eventType(ErrorEvent.class)
            .eventHandler(new ObstacleToErrorTransationHandler())
            .targetState(ErrorState)
            .build();
	Transition DrivingToErrorTransation = new TransitionBuilder()
            .name("Driving To Error")
            .sourceState(DrivingState)
            .eventType(ErrorEvent.class)
            .eventHandler(new DrivingToErrorTransationHandler())
            .targetState(ErrorState)
            .build();
	Transition ObstacleToDrivingTransation = new TransitionBuilder()
            .name("Obstacle To Driving")
            .sourceState(ObstacleState)
            .eventType(DrivingEvent.class)
            .eventHandler(new ObstacleToDrivingTransationHandler())
            .targetState(DrivingState)
            .build();
	Transition StandByToDrivingTransation = new TransitionBuilder()
            .name("StandBy To Driving")
            .sourceState(StandByState)
            .eventType(DrivingEvent.class)
            .eventHandler(new StandByToDrivingTransationHandler())
            .targetState(DrivingState)
            .build();

	FiniteStateMachine fsm = new FiniteStateMachineBuilder(states, StandByState)
			.registerTransition(ParkingToErrorTransation)
			.registerTransition(ErrorToStandByTransation)
			.registerTransition(DrivingToObstacleTransation)
			.registerTransition(DrivingToParkingTransation)
			.registerTransition(ParkingToStandByTransation)
			.registerTransition(ObstacleToErrorTransation)
			.registerTransition(DrivingToErrorTransation)
			.registerTransition(ObstacleToDrivingTransation)
			.registerTransition(StandByToDrivingTransation)
        	.build();

		System.out.println("Current state: " + fsm.getCurrentState().getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Instructions: Type the command corresponding to the desired event:");
        System.out.println("  - Type 'Driving' to trigger the event 'Driving'.");
        System.out.println("  - Type 'Error' to trigger the event 'Error'.");
        System.out.println("  - Type 'Driverting' to trigger the event 'Driverting'.");
        System.out.println("  - Type 'Parking' to trigger the event 'Parking'.");
        System.out.println("  - Type 'Off' to trigger the event 'Off'.");

		System.out.println("  - Type 'exit' to quit.");

        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
				case "driving":
			        fsm.fire(new DrivingEvent());
			        break;
				case "error":
			        fsm.fire(new ErrorEvent());
			        break;
				case "driverting":
			        fsm.fire(new DrivertingEvent());
			        break;
				case "parking":
			        fsm.fire(new ParkingEvent());
			        break;
				case "off":
			        fsm.fire(new OffEvent());
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
