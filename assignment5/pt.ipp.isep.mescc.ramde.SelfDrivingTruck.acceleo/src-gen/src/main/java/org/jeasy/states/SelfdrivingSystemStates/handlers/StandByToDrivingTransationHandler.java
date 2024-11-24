package org.jeasy.states.SelfdrivingSystemStates.handlers;

import org.jeasy.states.SelfdrivingSystemStates.events.DrivingEvent;
import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class StandByToDrivingTransationHandler implements EventHandler<DrivingEvent> {
    public void handleEvent(DrivingEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("carDriving..");
    }
}
