package org.jeasy.states.samples.light_mealy;

import org.jeasy.states.api.AbstractEvent;

public class LightOnEvent extends AbstractEvent {
    public LightOnEvent() {
        super("LightOnEvent");
    }

    protected LightOnEvent(String name) {
        super(name);
    }
}