package com.example.projectw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class main extends AppCompatActivity {
    ImageView menu,speker;
    DrawerLayout dl;
    RelativeLayout sci,com,art;
    NavigationView nv ;
    TextToSpeechHelper tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        menu=(ImageView) findViewById(R.id.menu);
        dl = (DrawerLayout) findViewById(R.id.drawer);
        sci = (RelativeLayout) findViewById(R.id.science);
        com = (RelativeLayout) findViewById(R.id.commerce);
        art = (RelativeLayout) findViewById(R.id.arts);
        speker = (ImageView) findViewById(R.id.speker);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dl.open();
            }
        });
        sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main.this, science.class);
                startActivity(i);
            }
        });
        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main.this, commerceact.class);
                startActivity(i);
            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main.this, Artact.class);
                startActivity(i);
            }
        });
        nv= (NavigationView) findViewById(R.id.nav1);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemid = item.getItemId();
                if (itemid == R.id.help)
                {
                    Intent i = new Intent(getApplicationContext(), helppage.class);
                    startActivity(i);
                }
                if (itemid == R.id.tts)
                {
                    Intent i = new Intent(getApplicationContext(), tts.class);
                    startActivity(i);
                }
                return false;
            }
        });
        tts =  new TextToSpeechHelper(this);
        speker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.speak("Please select the appropriate field of education to receive study materials.");
            }
        });
    }
}