package wxc.android.dagger.demo.modules.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import wxc.android.dagger.demo.R;
import wxc.android.dagger.demo.modules.android.way.AndroidActivity;
import wxc.android.dagger.demo.modules.android.way2.AndroidActivity2;
import wxc.android.dagger.demo.modules.beginner.BeginnerActivity;
import wxc.android.dagger.demo.modules.coffeemaker.CoffeeMakerActivity;
import wxc.android.dagger.demo.modules.multibindings.MultibindingsActivity;
import wxc.android.dagger.demo.modules.subcomponent.SubcomponentActivity;
import wxc.android.dagger.demo.modules.subcomponent2.SonActivity;

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

        findViewById(R.id.btn_multibindings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MultibindingsActivity.class));
            }
        });

        findViewById(R.id.btn_subcomponent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SubcomponentActivity.class));
            }
        });

        findViewById(R.id.btn_subcomponent2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SonActivity.class));
            }
        });

        findViewById(R.id.btn_android).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AndroidActivity.class));
            }
        });

        findViewById(R.id.btn_android2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AndroidActivity2.class));
            }
        });
    }
}
