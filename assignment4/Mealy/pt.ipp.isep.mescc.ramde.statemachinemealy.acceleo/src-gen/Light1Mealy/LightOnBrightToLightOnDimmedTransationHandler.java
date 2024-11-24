package org.jeasy.states.Light1Mealy;

import org.jeasy.states.api.EventHandler;

import java.util.Date;

public class LightOnBrightToLightOnDimmedTransationHandler implements EventHandler<OnEvent> {
    public void handleEvent(OnEvent event) {
        System.out.println("Notified about event '" + event.getName() + "' triggered at " + new Date(event.getTimestamp()));
        System.out.println("Dimmed..");
    }
}
