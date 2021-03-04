package io.maxspace.authmvvm.ui.signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import io.maxspace.authmvvm.R;
import io.maxspace.authmvvm.app.pojo.User;
import io.maxspace.authmvvm.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {

    private ActivitySignupBinding mBinding;

    public static void start(Activity activity) {
        Intent intent = new Intent(activity, SignupActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_signup);

        SignupViewModel model = new ViewModelProvider(this).get(SignupViewModel.class);

    }
}