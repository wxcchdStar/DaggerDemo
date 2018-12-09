package wxc.android.dagger.demo.base;

import java.util.Map;

import javax.inject.Singleton;

import dagger.Component;
import wxc.android.dagger.demo.modules.subcomponent.SubcomponentComponent;
import wxc.android.dagger.demo.modules.subcomponent.SubcomponentModule;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MyApplication application);

    Map<String, String> getMap();

//    List<String> getList();

    SubcomponentComponent.Builder subcomponentComponent();
}
