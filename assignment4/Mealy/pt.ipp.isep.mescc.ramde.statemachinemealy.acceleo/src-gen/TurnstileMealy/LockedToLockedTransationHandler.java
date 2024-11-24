package org.jeasy.states.TurnstileMealy;

import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class LockedToLockedTransationHandler implements EventHandler<PushEvent> {
    public void handleEvent(PushEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("Locked..");
    }
}
