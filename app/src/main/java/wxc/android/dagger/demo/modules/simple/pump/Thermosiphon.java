package wxc.android.dagger.demo.modules.simple.pump;

import android.util.Log;

import javax.inject.Inject;

import wxc.android.dagger.demo.modules.simple.heater.Heater;

public class Thermosiphon implements Pump {
    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            Log.e("Pump", "=> => pumping => =>");
        }
    }
}