package mobile.project.rsbl;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import mobile.project.MenuUtama.HomeActivity;

public class MainActivity extends Activity {
    public static int SPLASH_TIME_OUT = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
