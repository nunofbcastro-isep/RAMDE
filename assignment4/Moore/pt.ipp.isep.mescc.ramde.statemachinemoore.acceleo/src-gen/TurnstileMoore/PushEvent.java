package org.jeasy.states.TurnstileMoore;

import org.jeasy.states.api.AbstractEvent;

public class PushEvent extends AbstractEvent {
    public PushEvent() {
        super("Push");
    }

    protected PushEvent(String name) {
        super(name);
    }
}
