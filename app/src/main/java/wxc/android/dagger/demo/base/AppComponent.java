package wxc.android.dagger.demo.base;

import java.util.Map;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import wxc.android.dagger.demo.modules.android.AndroidActivityBindModule;
import wxc.android.dagger.demo.modules.subcomponent.SubcomponentComponent;

@Singleton
@Component(modules = {AppModule.class, AndroidSupportInjectionModule.class, AndroidActivityBindModule.class})
public interface AppComponent {
    void inject(MyApplication application);

    Map<String, String> getMap();

//    List<String> getList();

    SubcomponentComponent.Builder subcomponentComponent();
}
