package com.example.projectw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class singup extends AppCompatActivity {

    ScrollView sv;
    Button signin,scancel;
    Spinner jainv,gender;
    TextView ls;
    EditText name,spass,repass,mono,email,pname,dob,profession;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        sv= (ScrollView)findViewById(R.id.signsv);
        sv.setVerticalScrollBarEnabled(false);
        sv.setHorizontalScrollBarEnabled(false);

        name =(EditText) findViewById(R.id.name);
        spass =(EditText) findViewById(R.id.pass);
        repass =(EditText) findViewById(R.id.repass);
        mono =(EditText) findViewById(R.id.mobile);
        email =(EditText) findViewById(R.id.email);
        pname =(EditText) findViewById(R.id.pname);
        dob =(EditText) findViewById(R.id.dob);
        profession=(EditText) findViewById(R.id.profession);

        signin = (Button) findViewById(R.id.signin);
        scancel =(Button) findViewById(R.id.scancel);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nametxt = name.getText().toString();
                String passtxt = spass.getText().toString();
                String repasstxt = repass.getText().toString();
                String monotxt = mono.getText().toString();
                String emailtxt = email.getText().toString();
                String pnametxt = pname.getText().toString();
                String dobtxt = dob.getText().toString();
                String prof = profession.getText().toString();
                if (nametxt.isEmpty()) {
                    name.setError("Enter name Correct");
                } else if (passtxt.isEmpty()) {
                    spass.setError("Enter Password Correct");
                } else if (repasstxt.isEmpty()) {
                    repass.setError("Enter Password Correct");
                } else if (monotxt.isEmpty()) {
                    mono.setError("Enter Password Correct");
                } else if (emailtxt.isEmpty()) {
                    email.setError("Enter Password Correct");
                } else if (pnametxt.isEmpty()) {
                    pname.setError("Enter Password Correct");
                } else if (dobtxt.isEmpty()) {
                    dob.setError("Enter Password Correct");
                } else if (prof.isEmpty()) {
                    profession.setError("Enter Password Correct");
                } else
                {
                    Intent i = new Intent(getApplicationContext(), main.class);
                    startActivity(i);
                }
            }
        });
        ls = (TextView) findViewById(R.id.logswitcher);
        ls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), login.class);
                startActivity(i);
                finish();
            }
        });
        jainv = (Spinner) findViewById(R.id.jainv);
        List<String> mlist= Arrays.asList("JainVidya1","JainVidya2","JainVidya3","JainVidya4","JainVidya5","JainVidya6","JainVidya7","JainVidya8","JainVidya9","JainVidya0");
        ArrayAdapter<String> mArray=new ArrayAdapter<String>(this,R.layout.spinner_list,mlist);
        mArray.setDropDownViewResource(R.layout.spinner_list);
        jainv.setAdapter(mArray);

        gender = (Spinner) findViewById(R.id.gender);
        List<String> gender1= Arrays.asList("Male","Female","Other");
        ArrayAdapter<String> gender2=new ArrayAdapter<String>(this,R.layout.spinner_list,gender1);
        gender2.setDropDownViewResource(R.layout.spinner_list);
        gender.setAdapter(gender2);
    }
}