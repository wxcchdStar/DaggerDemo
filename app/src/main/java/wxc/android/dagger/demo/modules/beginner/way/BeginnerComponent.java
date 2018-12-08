package wxc.android.dagger.demo.modules.beginner.way;

import dagger.BindsInstance;
import dagger.Component;
import wxc.android.dagger.demo.base.ActivityScope;
import wxc.android.dagger.demo.base.AppComponent;
import wxc.android.dagger.demo.modules.beginner.BeginnerActivity;

@ActivityScope
@Component(modules = BeginnerModule.class, dependencies = AppComponent.class)
public interface BeginnerComponent {
    void inject(BeginnerActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder activity(BeginnerActivity activity);

        Builder appComponent(AppComponent appComponent);

        BeginnerComponent build();
    }
}
