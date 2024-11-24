package org.jeasy.states.samples.light_mealy;

import org.jeasy.states.api.AbstractEvent;

public class LightOffEvent extends AbstractEvent {

    public LightOffEvent() {
        super("LightOffEvent");
    }

    protected LightOffEvent(String name) {
        super(name);
    }

}