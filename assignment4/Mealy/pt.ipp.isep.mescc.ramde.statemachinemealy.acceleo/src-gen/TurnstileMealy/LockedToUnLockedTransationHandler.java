package org.jeasy.states.TurnstileMealy;

import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class LockedToUnLockedTransationHandler implements EventHandler<CoinEvent> {
    public void handleEvent(CoinEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("Un-Locked..");
    }
}
