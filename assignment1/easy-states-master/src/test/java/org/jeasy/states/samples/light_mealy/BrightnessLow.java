package org.jeasy.states.samples.light_mealy;

import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class BrightnessLow implements EventHandler<LightOnEvent> {
    public void handleEvent(LightOnEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("Dimming brightness..");
    }
}