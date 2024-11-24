package org.jeasy.states.TurnstileMealy;

import org.jeasy.states.api.AbstractEvent;

public class CoinEvent extends AbstractEvent {
    public CoinEvent() {
        super("Coin");
    }

    protected CoinEvent(String name) {
        super(name);
    }
}
