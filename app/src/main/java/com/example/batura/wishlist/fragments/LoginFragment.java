package com.example.batura.wishlist.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.batura.wishlist.MainActivity;
import com.example.batura.wishlist.R;


public class LoginFragment extends Fragment {

    private ImageView ivSignup;
    private ImageView ivGoLogin;
    private EditText etLoginEmail;
    private EditText etLoginPasswd;

    public LoginFragment() {
    }


    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivSignup = view.findViewById(R.id.singupbtn);
        ivSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        ivGoLogin = view.findViewById(R.id.GoLogin);
        ivGoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("IGOR","CLICK");
                doLogin();
            }
        });
        etLoginEmail = view.findViewById(R.id.etLoginEmail);
        etLoginPasswd = view.findViewById(R.id.etLoginPasswd);
    }

    private void doLogin() {
if (etLoginEmail.getText().toString().equals("a@a") && etLoginPasswd.getText().toString().equals("aaa")){
    Intent intent = new Intent(getContext(),MainActivity.class);
    startActivity(intent);

}
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
