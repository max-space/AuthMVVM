package io.maxspace.authmvvm.ui.signup;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import io.maxspace.authmvvm.app.pojo.User;

public class SignupViewModel extends ViewModel {
    private MutableLiveData<User> user;

    public LiveData<User> getUser() {
        if (user == null) {
            user = new MutableLiveData<User>();
        }

        return user;
    }

}
