package org.jeasy.states.SelfdrivingSystemStates.handlers;

import org.jeasy.states.SelfdrivingSystemStates.events.DrivertingEvent;
import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class DrivingToObstacleTransationHandler implements EventHandler<DrivertingEvent> {
    public void handleEvent(DrivertingEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("carDriverting..");
    }
}
