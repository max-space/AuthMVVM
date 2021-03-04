package io.maxspace.authmvvm.ui.intro.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.maxspace.authmvvm.R;

public class IntroThirdFragment extends Fragment {

    public IntroThirdFragment() { }

    public static IntroThirdFragment newInstance() {
        IntroThirdFragment fragment = new IntroThirdFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_intro_third, container, false);
    }
}