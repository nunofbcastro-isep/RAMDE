package org.jeasy.states.Light2Moore;

import org.jeasy.states.api.AbstractEvent;

public class OffEvent extends AbstractEvent {
    public OffEvent() {
        super("Off");
    }

    protected OffEvent(String name) {
        super(name);
    }
}
