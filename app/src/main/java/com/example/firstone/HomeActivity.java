package com.example.firstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button loginButton, aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        loginButton = (Button) findViewById(R.id.loginButton);
        aboutButton = (Button) findViewById(R.id.aboutButton);

        loginButton.setOnClickListener(this);
        aboutButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.loginButton) {
            Intent loginIntent = new Intent(HomeActivity.this, orderDetails.class);
            startActivity(loginIntent);
            Toast.makeText(HomeActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

        } else {
            {
                Intent aboutIntent = new Intent(HomeActivity.this, aboutUs.class);
                startActivity(aboutIntent);
                Toast.makeText(HomeActivity.this, "About App", Toast.LENGTH_SHORT).show();

            }
        }
    }

}







