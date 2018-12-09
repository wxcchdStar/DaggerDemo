package wxc.android.dagger.demo.modules.subcomponent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import wxc.android.dagger.demo.R;
import wxc.android.dagger.demo.base.MyApplication;

public class SubcomponentActivity extends AppCompatActivity {

    @Inject
    StringBuilder mStringBuilder;

    @Inject
    Map<String, String> mMap;

    @Inject
    List<String> mList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        MyApplication.sInstance
                .getAppComponent()
                .subcomponentComponent()
                .build()
                .inject(this);

        TextView contentTv = findViewById(R.id.tv_content);

        contentTv.append(String.valueOf(mStringBuilder));
        contentTv.append("\n");

        contentTv.append(String.valueOf(mMap));
        contentTv.append("\n");

        contentTv.append(String.valueOf(mList));
        contentTv.append("\n");
    }
}
