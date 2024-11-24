package org.jeasy.states.SelfdrivingSystemStates.events;

import org.jeasy.states.api.AbstractEvent;

public class DrivingEvent extends AbstractEvent {
    public DrivingEvent() {
        super("Driving");
    }

    protected DrivingEvent(String name) {
        super(name);
    }
}
