package org.jeasy.states.TurnstileMealy;

import org.jeasy.states.api.AbstractEvent;

public class PushEvent extends AbstractEvent {
    public PushEvent() {
        super("Push");
    }

    protected PushEvent(String name) {
        super(name);
    }
}
