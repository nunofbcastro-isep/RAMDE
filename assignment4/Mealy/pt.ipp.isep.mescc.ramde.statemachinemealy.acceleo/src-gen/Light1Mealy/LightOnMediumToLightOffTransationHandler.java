package org.jeasy.states.Light1Mealy;

import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class LightOnMediumToLightOffTransationHandler implements EventHandler<OffEvent> {
    public void handleEvent(OffEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("Off..");
    }
}
