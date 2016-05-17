package com.example.elsagher.meds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {

    public Button b2;

//declare edit text and then take their values in intent


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        b2 = (Button) findViewById(R.id.submit);
        assert b2 != null;
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormActivity.this, DrListActivity.class);
                startActivity(intent);

            }
        });
    }

}
