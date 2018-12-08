package wxc.android.dagger.demo.modules.simple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import wxc.android.dagger.demo.R;

public class CoffeeMakerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        TextView contentTv = findViewById(R.id.tv_content);
        contentTv.setText("Please see the log.");

        CoffeeMaker coffeeMaker = DaggerCoffeeShop
                .builder()
                .build()
                .maker();
        coffeeMaker.brew();
    }
}
