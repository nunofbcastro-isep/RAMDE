package org.jeasy.states.SelfdrivingSystemStates.handlers;

import org.jeasy.states.SelfdrivingSystemStates.events.ParkingEvent;
import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class DrivingToParkingTransationHandler implements EventHandler<ParkingEvent> {
    public void handleEvent(ParkingEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("CarParking..");
    }
}
