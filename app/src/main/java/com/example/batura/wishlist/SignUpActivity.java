package com.example.batura.wishlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.batura.wishlist.fragments.LoginFragment;

public class SignUpActivity extends AppCompatActivity {
private ImageView ivLogin;

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            this.finish();
        } else {
            getSupportFragmentManager().popBackStack();
        }
        //super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ivLogin = findViewById(R.id.loginBtn);
        ivLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.SignUpLayout, LoginFragment.newInstance()).addToBackStack(null).commit();
            }
        });
    }
}
