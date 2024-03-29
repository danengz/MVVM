package com.yu.mvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yu.mvvm.R;
import com.yu.mvvm.databinding.ActivityLoginBinding;
import com.yu.mvvm.viewModel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        new LoginViewModel(binding);
    }
}
