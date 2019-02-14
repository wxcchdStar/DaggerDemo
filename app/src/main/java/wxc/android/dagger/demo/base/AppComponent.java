package wxc.android.dagger.demo.base;

import java.util.Map;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import wxc.android.dagger.demo.modules.android.way.AndroidActivityBindModule;
import wxc.android.dagger.demo.modules.android.way2.AndroidActivityBindModule2;
import wxc.android.dagger.demo.modules.subcomponent.SubcomponentComponent;
import wxc.android.dagger.demo.modules.subcomponent2.Car;
import wxc.android.dagger.demo.modules.subcomponent2.CarModule;
import wxc.android.dagger.demo.modules.subcomponent2.SonComponent;

@Singleton
@Component(modules = {
        // 全局Module
        AppModule.class,
        // 使用Dagger.Android
        AndroidSupportInjectionModule.class,
        AndroidActivityBindModule.class,
        AndroidActivityBindModule2.class,
        // Subcomponent
        CarModule.class
})
public interface AppComponent {
    void inject(MyApplication application);

    Map<String, String> getMap();

//    List<String> getList();

    // 必须向外提供，表明可以注入到其他组件中
    Car getCar();

    SubcomponentComponent.Builder subcomponentComponent();

    SonComponent.Builder sonComponent();
}
