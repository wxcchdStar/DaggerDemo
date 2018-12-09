package wxc.android.dagger.demo.modules.coffeemaker;

import dagger.Binds;
import dagger.Module;
import wxc.android.dagger.demo.modules.coffeemaker.pump.Pump;
import wxc.android.dagger.demo.modules.coffeemaker.pump.Thermosiphon;

@Module
public abstract class PumpModule {
  @Binds
  abstract Pump providePump(Thermosiphon pump);
}