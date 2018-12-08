package wxc.android.dagger.demo.modules.simple;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import wxc.android.dagger.demo.modules.simple.heater.ElectricHeater;
import wxc.android.dagger.demo.modules.simple.heater.Heater;

@Module(includes = PumpModule.class)
class DripCoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
