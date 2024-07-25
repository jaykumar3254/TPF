package com.example.projectw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class science extends AppCompatActivity  implements View.OnClickListener {

    Button btech,mtech,bsci,msci,bedu,medu;
    ImageView shome;
    FrameLayout fl;
    HorizontalScrollView sciscroll1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        sciscroll1 = (HorizontalScrollView) findViewById(R.id.sciscrill1);
        sciscroll1.setHorizontalScrollBarEnabled(false);
        sciscroll1.setVerticalScrollBarEnabled(false);

        shome=(ImageView) findViewById(R.id.scihome);
        shome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        fl=(FrameLayout) findViewById(R.id.framelay1);

        btech=(Button) findViewById(R.id.be);
        mtech=(Button) findViewById(R.id.me);
        bsci=(Button) findViewById(R.id.bos1);
        msci=(Button) findViewById(R.id.mos1);
        bedu=(Button) findViewById(R.id.boe1);
        medu=(Button) findViewById(R.id.moe1);

        btech.setOnClickListener(this);
        mtech.setOnClickListener(this);
        bsci.setOnClickListener(this);
        msci.setOnClickListener(this);
        bedu.setOnClickListener(this);
        medu.setOnClickListener(this);

        loadFragment(new btech1());

    }
    @Override
    public void onClick(View view) {
        Fragment fragment = null;

        switch (view.getId()) {
            case R.id.be:
                fragment=new btech1();
                break;
            case R.id.me:
                fragment= new mtech1();
                break;
            case R.id.bos1:
                fragment= new bos();
                break;
            case R.id.mos1:
                fragment= new mos();
                break;
            case R.id.boe1:
                fragment= new boe();
                break;
            case R.id.moe1:
                fragment= new moe();
                break;
        }

        if (fragment != null) {
            loadFragment(fragment);
        }
    }
    private void loadFragment(Fragment fragment) {
        // Create a FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Replace the FrameLayout with the new Fragment
        fragmentTransaction.replace(R.id.framelay1, fragment);
        // Commit the transaction
        fragmentTransaction.commit();
    }
}