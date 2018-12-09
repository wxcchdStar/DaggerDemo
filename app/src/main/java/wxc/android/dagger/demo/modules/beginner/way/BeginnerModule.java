package wxc.android.dagger.demo.modules.beginner.way;

import android.app.ProgressDialog;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import wxc.android.dagger.demo.base.ActivityScope;
import wxc.android.dagger.demo.modules.beginner.BeginnerActivity;

@Module
public abstract class BeginnerModule {

    @ActivityScope
    @Provides
    public static List<String> provideList() {
        return new ArrayList<>();
    }

    @ActivityScope
    @Provides
    public static ProgressDialog provideProgressDialog(BeginnerActivity activity) {
        return new ProgressDialog(activity);
    }

}
