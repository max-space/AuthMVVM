package io.maxspace.authmvvm.ui.intro.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

import io.maxspace.authmvvm.ui.intro.fragments.IntroSecondFragment;
import io.maxspace.authmvvm.ui.intro.fragments.IntroFirstFragment;
import io.maxspace.authmvvm.ui.intro.fragments.IntroThirdFragment;

public class IntroAdapter extends FragmentPagerAdapter {
    public IntroAdapter(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = IntroFirstFragment.newInstance();
                break;
            case 1:
                fragment = IntroSecondFragment.newInstance();
                break;
            case 2:
                fragment = IntroThirdFragment.newInstance();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
