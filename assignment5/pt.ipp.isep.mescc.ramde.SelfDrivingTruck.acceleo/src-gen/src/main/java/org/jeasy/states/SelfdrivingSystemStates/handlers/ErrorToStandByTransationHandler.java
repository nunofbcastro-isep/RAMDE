package org.jeasy.states.SelfdrivingSystemStates.handlers;

import org.jeasy.states.SelfdrivingSystemStates.events.OffEvent;
import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class ErrorToStandByTransationHandler implements EventHandler<OffEvent> {
    public void handleEvent(OffEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("carOff..");
    }
}
