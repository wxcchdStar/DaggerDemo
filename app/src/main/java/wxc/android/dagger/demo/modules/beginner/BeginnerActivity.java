package wxc.android.dagger.demo.modules.beginner;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

import wxc.android.dagger.demo.R;
import wxc.android.dagger.demo.base.MyApplication;
import wxc.android.dagger.demo.modules.beginner.way.DaggerMainComponent;

public class BeginnerActivity extends AppCompatActivity {

    @Inject
    List<String> mList1;

    @Inject
    List<String> mList2;

    @Inject
    ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        // 第一种方式
        DaggerMainComponent.builder()
                .appComponent(MyApplication.sInstance.getAppComponent())
                .activity(this)
                .build()
                .inject(this);

//        // 第二种方式，不推荐：因为需要主动new module对象
//        DaggerMainComponent2.builder()
//                .appComponent(MyApplication.sInstance.getAppComponent())
//                .mainModule2(new MainModule2(this))
//                .build()
//                .inject(this);

        TextView contentTv = findViewById(R.id.tv_content);
        contentTv.setText("");
//        contentTv.append(String.valueOf(application));

        mList1.add("A");
        contentTv.append(String.valueOf(mList1));
        contentTv.append("\n");

        mList2.add("B");
        contentTv.append(String.valueOf(mList2));
        contentTv.append("\n");

        contentTv.append(String.valueOf(mProgressDialog));
        contentTv.append("\n");
    }
}