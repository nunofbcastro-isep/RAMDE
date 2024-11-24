package org.jeasy.states.samples.light_mealy;

import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class BrightnessOff implements EventHandler<LightOffEvent> {
    public void handleEvent(LightOffEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("Turning off brightness..");
    }
}