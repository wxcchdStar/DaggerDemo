package wxc.android.dagger.demo.base;

import android.app.Application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import wxc.android.dagger.demo.modules.subcomponent.SubcomponentComponent;

@Module(subcomponents = SubcomponentComponent.class)
public class AppModule {

    private Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    public Map<String, String> provideMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Application", "123");
        return map;
    }

    @Singleton
    @Provides
    public static List<String> provideList() {
        List<String> list = new ArrayList<>();
        list.add("application");
        return list;
    }

}
