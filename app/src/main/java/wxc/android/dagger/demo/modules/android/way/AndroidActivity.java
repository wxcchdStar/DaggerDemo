package wxc.android.dagger.demo.modules.android.way;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import wxc.android.dagger.demo.R;

public class AndroidActivity extends AppCompatActivity {

    @Inject
    String mString;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        TextView contentTv = findViewById(R.id.tv_content);

        contentTv.append(String.valueOf(mString));
    }
}
