package wxc.android.dagger.demo.base;

import java.util.Map;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import wxc.android.dagger.demo.modules.android.way.AndroidActivityBindModule;
import wxc.android.dagger.demo.modules.android.way2.AndroidActivityBindModule2;
import wxc.android.dagger.demo.modules.subcomponent.SubcomponentComponent;

@Singleton
@Component(modules = {AppModule.class, AndroidSupportInjectionModule.class,
        AndroidActivityBindModule.class, AndroidActivityBindModule2.class})
public interface AppComponent {
    void inject(MyApplication application);

    Map<String, String> getMap();

//    List<String> getList();

    SubcomponentComponent.Builder subcomponentComponent();
}
