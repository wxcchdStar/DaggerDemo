package wxc.android.dagger.demo.modules.coffeemaker.heater;

import android.util.Log;

public class ElectricHeater implements Heater {
    boolean heating;

    @Override
    public void on() {
        Log.e("Heater", "~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}