package io.maxspace.authmvvm.ui.intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import io.maxspace.authmvvm.R;
import io.maxspace.authmvvm.databinding.ActivityIntroBinding;
import io.maxspace.authmvvm.ui.intro.adapters.IntroAdapter;

public class IntroActivity extends AppCompatActivity {
    private ActivityIntroBinding mBinding;
    private IntroAdapter mIntroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_intro);

        mIntroAdapter = new IntroAdapter(getSupportFragmentManager(), 0);
        mBinding.walkthroughVp.setAdapter(mIntroAdapter);

        mBinding.signupBtn.setOnClickListener(v -> SignupActivity.start(mActivity));
    }
}