
package mobile.project.MenuUtama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mobile.project.rsbl.AbdulMoeloek;
import mobile.project.rsbl.R;
import mobile.project.rsbl.RSAdvent;
import mobile.project.rsbl.RS_dadi;
import mobile.project.rsbl.RSimanuel;
import mobile.project.rsbl.RSuripSumoharja;
import mobile.project.rsbl.RestuBunda;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void RSabdulMoeloek(View view) {
        Intent intent = new Intent(HomeActivity.this, AbdulMoeloek.class);
        startActivity(intent);
    }

    public void RSadvent(View view) {
        Intent intent = new Intent(HomeActivity.this, RSAdvent.class);
        startActivity(intent);
    }

    public void RSimanuel(View view) {
        Intent intent = new Intent(HomeActivity.this, RSimanuel.class);
        startActivity(intent);
    }

    public void RSdadi(View view) {
        Intent intent = new Intent(HomeActivity.this, RS_dadi.class);
        startActivity(intent);
    }

    public void RSurip(View view) {
        Intent intent = new Intent(HomeActivity.this, RSuripSumoharja.class);
        startActivity(intent);
    }

    public void RSIArestubunda(View view) {
        Intent intent = new Intent(HomeActivity.this, RestuBunda.class);
        startActivity(intent);
    }
}
