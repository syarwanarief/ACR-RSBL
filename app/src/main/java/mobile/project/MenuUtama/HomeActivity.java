
package mobile.project.MenuUtama;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import mobile.project.rsbl.AbdulMoeloek;
import mobile.project.rsbl.R;
import mobile.project.rsbl.RSAdvent;
import mobile.project.rsbl.RS_dadi;
import mobile.project.rsbl.RSimanuel;
import mobile.project.rsbl.RSuripSumoharja;
import mobile.project.rsbl.RestuBunda;

public class HomeActivity extends AppCompatActivity {

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;

    private SliderView sliderView;
    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        sliderView = (SliderView) findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) findViewById(R.id.pagesContainer);
        setupSlider();
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

    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-1.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-2.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-3.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-4.jpg"));

        mAdapter = new SliderPagerAdapter(getSupportFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(this, mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }
}
