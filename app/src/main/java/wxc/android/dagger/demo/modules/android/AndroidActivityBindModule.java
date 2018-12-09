package wxc.android.dagger.demo.modules.android;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import wxc.android.dagger.demo.base.ActivityScope;

@Module//(subcomponents = AndroidActivityComponent.class)
public abstract class AndroidActivityBindModule {
//    @Binds
//    @IntoMap
//    @ActivityKey(AndroidActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindAndroidActivityInjectorFactory(AndroidActivityComponent.Builder builder);

    @ActivityScope
    @ContributesAndroidInjector(modules = AndroidActivityModule.class)
    abstract AndroidActivity contributeAndroidActivityInjector();
}
