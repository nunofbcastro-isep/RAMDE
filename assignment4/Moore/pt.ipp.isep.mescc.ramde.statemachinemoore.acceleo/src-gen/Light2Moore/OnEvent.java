package org.jeasy.states.Light2Moore;

import org.jeasy.states.api.AbstractEvent;

public class OnEvent extends AbstractEvent {
    public OnEvent() {
        super("On");
    }

    protected OnEvent(String name) {
        super(name);
    }
}
