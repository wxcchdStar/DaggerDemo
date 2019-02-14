package wxc.android.dagger.demo.modules.subcomponent2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import wxc.android.dagger.demo.base.MyApplication;

public class SonActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyApplication.sInstance.getAppComponent()
                .sonComponent()
                .build()
                .inject(this);

        TextView textView = new TextView(this);
        textView.setText(String.valueOf(mCar));
        setContentView(textView);
    }
}
