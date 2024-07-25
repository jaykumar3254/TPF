package com.example.projectw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Thread th;
    ImageView imgviw,imgviw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgviw = (ImageView) findViewById(R.id.splash1);
        Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imgviw.startAnimation(an);
        imgviw2 = (ImageView) findViewById(R.id.splash2);
        Animation an1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zooom);
        imgviw2.startAnimation(an1);


        th= new Thread()
        {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);
                    Intent i = new Intent(getApplicationContext(), login.class);
                    startActivity(i);
                    finish();
                }catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        };
        th.start();
    }
}