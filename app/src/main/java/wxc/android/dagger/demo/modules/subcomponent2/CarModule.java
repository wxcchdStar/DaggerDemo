package wxc.android.dagger.demo.modules.subcomponent2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = SonComponent.class)
public class CarModule {

    @Singleton
    @Provides
    public static Car provideCar() {
        return new Car();
    }
}
