package org.jeasy.states.SelfdrivingSystemStates.handlers;

import org.jeasy.states.SelfdrivingSystemStates.events.ErrorEvent;
import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class ParkingToErrorTransationHandler implements EventHandler<ErrorEvent> {
    public void handleEvent(ErrorEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("carError..");
    }
}
