package wxc.android.dagger.demo.modules.coffeemaker;

import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;
import wxc.android.dagger.demo.modules.coffeemaker.heater.Heater;
import wxc.android.dagger.demo.modules.coffeemaker.pump.Pump;

public class CoffeeMaker {
    private final Lazy<Heater> heater; // Create a possibly costly heater only when we use it.
    private final Pump pump;

    @Inject
    CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        Log.e("CoffeeMaker"," [_]P coffee! [_]P ");
        heater.get().off();
    }
}