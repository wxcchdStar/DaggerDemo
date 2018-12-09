package wxc.android.dagger.demo.modules.coffeemaker.heater;

public interface Heater {
    void on();

    void off();

    boolean isHot();
}