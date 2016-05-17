package com.example.elsagher.meds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {

    public Button b2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
         b2 = (Button) findViewById(R.id.submit);
        assert b2 != null;
        b2.setOnClickListener(OnClicksubmitbuttonListenser);    }

    View.OnClickListener OnClicksubmitbuttonListenser = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToWelcomeActivity();
        }
    };
    private void goToWelcomeActivity(){
        Intent intent = new Intent(this, DrListActivity.class);
        startActivity(intent);

    }





}
