package wxc.android.dagger.demo.modules.beginner.way2;

import android.app.ProgressDialog;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;
import wxc.android.dagger.demo.base.ActivityScope;
import wxc.android.dagger.demo.modules.beginner.BeginnerActivity;

@Module
public class MainModule2 {

    private BeginnerActivity mActivity;

    public MainModule2(BeginnerActivity activity) {
        mActivity = activity;
    }

    @ActivityScope
    @Provides
    public List<String> provideList() {
        return new ArrayList<>();
    }

    @ActivityScope
    @Provides
    public ProgressDialog provideProgressDialog() {
        return new ProgressDialog(mActivity);
    }

}
