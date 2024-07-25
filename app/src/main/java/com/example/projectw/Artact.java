package com.example.projectw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class Artact extends AppCompatActivity implements View.OnClickListener  {

    ImageView ahome;
    Button bart,mart,bedu1,medu1,bsowk,msowk,mphy,drphy;
    FrameLayout afl;
    HorizontalScrollView artscroll1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artact);

        artscroll1 = (HorizontalScrollView) findViewById(R.id.artscrill1);
        artscroll1.setHorizontalScrollBarEnabled(false);
        artscroll1.setVerticalScrollBarEnabled(false);

        ahome=(ImageView) findViewById(R.id.arthome);
        ahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        afl=(FrameLayout) findViewById(R.id.aframelay1);

        bart=(Button) findViewById(R.id.ba);
        mart=(Button) findViewById(R.id.ma);
        bedu1=(Button) findViewById(R.id.bed);
        medu1=(Button) findViewById(R.id.med);
        bsowk=(Button) findViewById(R.id.bsw);
        msowk=(Button) findViewById(R.id.msw);
        mphy=(Button) findViewById(R.id.mphil);
        drphy=(Button) findViewById(R.id.phd);

        bart.setOnClickListener(this);
        mart.setOnClickListener(this);
        bedu1.setOnClickListener(this);
        medu1.setOnClickListener(this);
        bsowk.setOnClickListener(this);
        msowk.setOnClickListener(this);
        mphy.setOnClickListener(this);
        drphy.setOnClickListener(this);

        aloadFragment(new ba1());
    }
    @Override
    public void onClick(View view) {
        Fragment fragment = null;

        switch (view.getId()) {
            case R.id.ba:
                fragment=new ba1();
                break;
            case R.id.ma:
                fragment= new ma1();
                break;
            case R.id.bed:
                fragment= new bed1();
                break;
            case R.id.med:
                fragment= new med1();
                break;
            case R.id.bsw:
                fragment= new bsw1();
                break;
            case R.id.msw:
                fragment= new msw1();
                break;
            case R.id.mphil:
                fragment= new mphile1();
                break;
            case R.id.phd:
                fragment= new phd1();
                break;

        }
        if (fragment != null) {
            aloadFragment(fragment);
        }
    }
    private void aloadFragment(Fragment fragment) {
        // Create a FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Replace the FrameLayout with the new Fragment
        fragmentTransaction.replace(R.id.aframelay1, fragment);
        // Commit the transaction
        fragmentTransaction.commit();
    }
}