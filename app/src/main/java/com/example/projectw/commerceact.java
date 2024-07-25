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

public class commerceact extends AppCompatActivity implements View.OnClickListener {

    ImageView chome;
    Button bcom,mcom,bba,bca,bms,mba,ca;
    FrameLayout cfl;
    HorizontalScrollView comscroll1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerceact);

        comscroll1 = (HorizontalScrollView) findViewById(R.id.comscroll1);
        comscroll1.setHorizontalScrollBarEnabled(false);
        comscroll1.setVerticalScrollBarEnabled(false);

        chome=(ImageView) findViewById(R.id.comhome);
        chome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cfl=(FrameLayout) findViewById(R.id.cframelay1);

        bcom=(Button) findViewById(R.id.bcom11);
        mcom=(Button) findViewById(R.id.mcom11);
        bba=(Button) findViewById(R.id.bba11);
        bca=(Button) findViewById(R.id.bca11);
        bms=(Button) findViewById(R.id.bms11);
        mba=(Button) findViewById(R.id.mba11);
        ca=(Button) findViewById(R.id.ca11);

        bcom.setOnClickListener(this);
        mcom.setOnClickListener(this);
        bba.setOnClickListener(this);
        bca.setOnClickListener(this);
        bms.setOnClickListener(this);
        mba.setOnClickListener(this);
        ca.setOnClickListener(this);

        cloadFragment(new bcom1());
    }
    @Override
    public void onClick(View view) {
        Fragment fragment = null;

        switch (view.getId()) {
            case R.id.bcom11:
                fragment=new bcom1();
                break;
            case R.id.mcom11:
                fragment= new mcom1();
                break;
            case R.id.bba11:
                fragment= new bba1();
                break;
            case R.id.bca11:
                fragment= new bca1();
                break;
            case R.id.bms11:
                fragment= new bms1();
                break;
            case R.id.mba11:
                fragment= new mba1();
                break;
            case R.id.ca11:
                fragment= new ca1();
                break;
        }
        if (fragment != null) {
            cloadFragment(fragment);
        }
    }
    private void cloadFragment(Fragment fragment) {
        // Create a FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Replace the FrameLayout with the new Fragment
        fragmentTransaction.replace(R.id.cframelay1, fragment);
        // Commit the transaction
        fragmentTransaction.commit();
    }
}