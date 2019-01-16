package wxc.android.dagger.demo.modules.android.way;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = AndroidActivityBindModule.AndroidActivityComponent.class)
public abstract class AndroidActivityBindModule {

    @Binds
    @IntoMap
    @ActivityKey(AndroidActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindAndroidActivityInjectorFactory(
            AndroidActivityComponent.Builder builder);

    @Subcomponent(modules = AndroidActivityBindModule.AndroidActivityModule.class)
    public interface AndroidActivityComponent extends AndroidInjector<AndroidActivity> {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<AndroidActivity> { }
    }

    @Module
    public static class AndroidActivityModule {

        @Provides
        public static String providerString() {
            return "Dagger.Android";
        }
    }

}
