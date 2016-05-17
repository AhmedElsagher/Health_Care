package com.example.elsagher.meds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    public EditText usernameEditText;
    public EditText passwordEduitText;
    public CheckBox rememberMeCheckBox;
//    public TextView forgotPasswordTextView;
    public Button loginButton;
    public Button signUpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameEditText = (EditText) findViewById(R.id.edittext_username);
        passwordEduitText = (EditText) findViewById(R.id.edittext_password);
        rememberMeCheckBox = (CheckBox) findViewById(R.id.checkbox_remember_me);
//        forgotPasswordTextView = (TextView) findViewById(R.id.textview_forgot_password);
        loginButton = (Button) findViewById(R.id.button_login);
        signUpButton = (Button) findViewById(R.id.button_sign_up);
        loginButton.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if (v==signUpButton){
            Intent intent = new Intent(this, SignupActivity.class);
            startActivity(intent);
        }else if (v==loginButton){
            String username,pass;
username=usernameEditText.getText().toString();
pass=passwordEduitText.getText().toString();


            Intent intent = new Intent(this, TabActivity.class);
            startActivity(intent);
        }
    }
}
