package wxc.android.dagger.demo.modules.android.way2;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AndroidActivityBindModule2 {

    @ContributesAndroidInjector(modules = AndroidActivityModule2.class)
    abstract AndroidActivity2 contributeAndroidActivityInjector();

    @Module
    public static class AndroidActivityModule2 {

        @Provides
        public static String providerString() {
            return "Dagger.Android2";
        }
    }

}
