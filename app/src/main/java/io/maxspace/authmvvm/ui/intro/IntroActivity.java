package io.maxspace.authmvvm.ui.intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import io.maxspace.authmvvm.R;
import io.maxspace.authmvvm.ui.intro.adapters.IntroAdapter;

public class IntroActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private IntroAdapter mIntroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        mViewPager = findViewById(R.id.walkthroughVp);
        mIntroAdapter = new IntroAdapter(getSupportFragmentManager(), 0);

        mViewPager.setAdapter(mIntroAdapter);
    }
}