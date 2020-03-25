package com.example.firstone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class aboutUs extends AppCompatActivity implements View.OnClickListener {

    private ImageView myImageView1, myImageView2;
    private TextView myTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        myImageView1 = (ImageView) findViewById(R.id.myImageView1Id);
        myImageView2 = (ImageView) findViewById(R.id.myImageView2Id);
        myTextView1 = findViewById(R.id.myTextView1Id);

        myImageView1.setOnClickListener(this);
        myImageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.myImageView1Id) {
            myImageView1.setVisibility(View.GONE);
            myImageView2.setVisibility(View.VISIBLE);
        } else{
            myImageView2.setVisibility(View.GONE);
            myImageView1.setVisibility(View.VISIBLE);
        }


    }
}
