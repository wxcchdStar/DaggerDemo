package wxc.android.dagger.demo.modules.android;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidActivityModule {

    @Provides
    public static String providerString() {
        return "Dagger.Android";
    }
}
