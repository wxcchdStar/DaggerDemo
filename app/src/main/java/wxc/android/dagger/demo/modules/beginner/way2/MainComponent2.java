package wxc.android.dagger.demo.modules.beginner.way2;

import dagger.Component;
import wxc.android.dagger.demo.base.ActivityScope;
import wxc.android.dagger.demo.base.AppComponent;
import wxc.android.dagger.demo.modules.beginner.BeginnerActivity;

@ActivityScope
@Component(modules = MainModule2.class, dependencies = AppComponent.class)
public interface MainComponent2 {
    void inject(BeginnerActivity activity);
}
