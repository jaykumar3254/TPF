package com.example.projectw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class helppage extends AppCompatActivity {

    ImageView im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helppage);

        im1 = (ImageView) findViewById(R.id.helpimg1);
        Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveup);
        im1.startAnimation(an);

    }
}