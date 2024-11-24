package org.jeasy.states.SelfdrivingSystemStates.events;

import org.jeasy.states.api.AbstractEvent;

public class ErrorEvent extends AbstractEvent {
    public ErrorEvent() {
        super("Error");
    }

    protected ErrorEvent(String name) {
        super(name);
    }
}
