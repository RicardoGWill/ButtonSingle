package com.ricardogwill.buttonsingle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Button clicked", Toast.LENGTH_SHORT).show();
    }
}
