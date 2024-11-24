package org.jeasy.states.SelfdrivingSystemStates.events;

import org.jeasy.states.api.AbstractEvent;

public class ParkingEvent extends AbstractEvent {
    public ParkingEvent() {
        super("Parking");
    }

    protected ParkingEvent(String name) {
        super(name);
    }
}
