package wxc.android.dagger.demo.base;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class MyApplication extends Application implements HasActivityInjector {

    public static MyApplication sInstance;

    private AppComponent mAppComponent;

    @Inject
    Map<String, String> mMap;

    @Inject
    List<String> mList;

    @Inject
    DispatchingAndroidInjector<Activity> mDispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        mAppComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
        mAppComponent.inject(this);

        mMap.put("app", "456");
        Log.e("Application", String.valueOf(mMap));
        Log.e("Application", String.valueOf(mList));
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mDispatchingActivityInjector;
    }
}
