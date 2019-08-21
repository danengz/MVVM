package com.yu.mvvm.viewModel;

import android.nfc.Tag;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import com.yu.mvvm.databinding.ActivityLoginBinding;
import com.yu.mvvm.model.UserInfo;

public class LoginViewModel {

    public UserInfo userInfo;

    public LoginViewModel(ActivityLoginBinding binding) {
        userInfo = new UserInfo();
        binding.setLoginViewModel(this);
    }

    public TextWatcher usernameInputListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            userInfo.username.set(String.valueOf(s));
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public TextWatcher passwordInputListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            userInfo.password.set(String.valueOf(s));
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public View.OnClickListener loginClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    if ("123".equals(userInfo.username.get()) && "456".equals(userInfo.password.get())){
                        Log.e("haha", "登录成功");
                    }else {
                        Log.e("haha", "登录失败");
                    }
                }
            }).start();
        }
    };
}
