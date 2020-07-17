package com.app.priaryapp.view.tutorial;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.app.priaryapp.R;
import com.app.priaryapp.util.ZoomOutPageTransformer;
import com.app.priaryapp.adapter.ScreenSlidePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TutorialActivity extends FragmentActivity {

    private ViewPager2 tutorialViewPager;
    private FragmentStateAdapter tutorialPagerAdapter;
    private List<Integer> tutorialLayouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        tutorialViewPager = findViewById(R.id.tutorial_viewpager);
        tutorialViewPager.setPageTransformer(new ZoomOutPageTransformer());
        tutorialLayouts = new ArrayList<>();
        tutorialLayouts.add(R.layout.tutorial_1);
        tutorialLayouts.add(R.layout.tutorial_2);
        tutorialLayouts.add(R.layout.tutorial_3);
        tutorialLayouts.add(R.layout.tutorial_4);
        tutorialLayouts.add(R.layout.tutorial_5);

        tutorialPagerAdapter = new ScreenSlidePagerAdapter(this, tutorialLayouts);
        tutorialViewPager.setAdapter(tutorialPagerAdapter);

    }
}
