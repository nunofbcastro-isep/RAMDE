package org.jeasy.states.SelfdrivingSystemStates.events;

import org.jeasy.states.api.AbstractEvent;

public class DrivertingEvent extends AbstractEvent {
    public DrivertingEvent() {
        super("Driverting");
    }

    protected DrivertingEvent(String name) {
        super(name);
    }
}
