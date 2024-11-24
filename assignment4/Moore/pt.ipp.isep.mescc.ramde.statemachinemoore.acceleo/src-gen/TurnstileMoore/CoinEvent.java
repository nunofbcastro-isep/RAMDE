package org.jeasy.states.TurnstileMoore;

import org.jeasy.states.api.AbstractEvent;

public class CoinEvent extends AbstractEvent {
    public CoinEvent() {
        super("Coin");
    }

    protected CoinEvent(String name) {
        super(name);
    }
}
