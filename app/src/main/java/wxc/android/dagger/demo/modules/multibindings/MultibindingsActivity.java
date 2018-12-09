package wxc.android.dagger.demo.modules.multibindings;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Set;

import javax.inject.Inject;

import wxc.android.dagger.demo.R;

public class MultibindingsActivity extends AppCompatActivity {

    @Inject
    Set<String> mStringSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        TextView contentTv = findViewById(R.id.tv_content);

        MultibindingsComponent component = DaggerMultibindingsComponent.create();
        component.inject(this);

        contentTv.append(String.valueOf(mStringSet));
        contentTv.append("\n");

        contentTv.append(String.valueOf(component.longMaxValueByString().get("longMaxValue")));
        contentTv.append("\n");

        contentTv.append(String.valueOf(component.intMaxValueByString().get("intMaxValue")));
        contentTv.append("\n");

        contentTv.append(String.valueOf(component.stringByClass().get(String.class)));
        contentTv.append("\n");

        contentTv.append(String.valueOf(component.stringByClass().get(StringBuilder.class)));
        contentTv.append("\n");

        contentTv.append(String.valueOf(component.stringByClass().get(StringBuffer.class)));
        contentTv.append("\n");

//        contentTv.append(String.valueOf(component.myKeyStringMap().get(null)));
//        contentTv.append("\n");
    }

//    @AutoAnnotation
//    public static MyKey createMyKey() {
//        return new Auto
//    }
}
