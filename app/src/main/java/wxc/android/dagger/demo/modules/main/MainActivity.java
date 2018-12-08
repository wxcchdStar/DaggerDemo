package wxc.android.dagger.demo.modules.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import wxc.android.dagger.demo.R;
import wxc.android.dagger.demo.modules.beginner.BeginnerActivity;
import wxc.android.dagger.demo.modules.simple.CoffeeMakerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_coffee_maker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CoffeeMakerActivity.class));
            }
        });


        findViewById(R.id.btn_beginner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeginnerActivity.class));
            }
        });
    }
}
