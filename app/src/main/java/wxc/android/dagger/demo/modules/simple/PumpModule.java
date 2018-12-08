package wxc.android.dagger.demo.modules.simple;

import dagger.Binds;
import dagger.Module;
import wxc.android.dagger.demo.modules.simple.pump.Pump;
import wxc.android.dagger.demo.modules.simple.pump.Thermosiphon;

@Module
public abstract class PumpModule {
  @Binds
  abstract Pump providePump(Thermosiphon pump);
}