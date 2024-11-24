package org.jeasy.states.samples.turnstile_moore;

import org.jeasy.states.api.FiniteStateMachine;
import org.jeasy.states.api.FiniteStateMachineException;
import org.jeasy.states.api.State;
import org.jeasy.states.api.Transition;
import org.jeasy.states.core.FiniteStateMachineBuilder;
import org.jeasy.states.core.TransitionBuilder;
import org.jeasy.states.samples.turnstile.CoinEvent;
import org.jeasy.states.samples.turnstile.PushEvent;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TurnstileMoore  {

    public static void main(String[] args) throws FiniteStateMachineException {

        /*
         * Define FSM states
         */
        State locked = new State("locked", "locked");
        State unlocked = new State("unlocked", "unlocked");

        Set<State> states = new HashSet<>();
        states.add(locked);
        states.add(unlocked);

        /*
         * Define FSM transitions
         */
        Transition unlock = new TransitionBuilder()
                .name("unlock")
                .sourceState(locked)
                .eventType(CoinEvent.class)
                .targetState(unlocked)
                .build();

        Transition pushLocked = new TransitionBuilder()
                .name("pushLocked")
                .sourceState(locked)
                .eventType(PushEvent.class)
                .targetState(locked)
                .build();

        Transition lock = new TransitionBuilder()
                .name("lock")
                .sourceState(unlocked)
                .eventType(PushEvent.class)
                .targetState(locked)
                .build();

        Transition coinUnlocked = new TransitionBuilder()
                .name("coinUnlocked")
                .sourceState(unlocked)
                .eventType(CoinEvent.class)
                .targetState(unlocked)
                .build();

        /*
         * Build FSM instance
         */
        FiniteStateMachine turnstileStateMachine = new FiniteStateMachineBuilder(states, locked)
                .registerTransition(lock)
                .registerTransition(pushLocked)
                .registerTransition(unlock)
                .registerTransition(coinUnlocked)
                .build();

        /*
         * Fire some events and print FSM state
         */
        System.out.println("Turnstile initial state : " + turnstileStateMachine.getCurrentState().getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which event do you want to fire?");
        System.out.println("1. Push [p]");
        System.out.println("2. Coin [c]");
        System.out.println("Press [q] to quit tutorial.");
        while (true) {
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("p")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing push event..");
                turnstileStateMachine.fire(new PushEvent());
                System.out.println("Turnstile state : " + turnstileStateMachine.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("c")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing coin event..");
                turnstileStateMachine.fire(new CoinEvent());
                System.out.println("Turnstile state : " + turnstileStateMachine.getCurrentState().getName());
            }
            if (input.trim().equalsIgnoreCase("q")) {
                System.out.println("input = " + input.trim());
                System.out.println("Bye!");
                System.exit(0);
            }

        }

    }
}
