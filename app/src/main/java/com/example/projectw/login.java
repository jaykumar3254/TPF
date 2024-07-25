package com.example.projectw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    Button sign,loginbtn;
    EditText uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        uname= (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.lpass);
        sign =(Button) findViewById(R.id.switcher);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), singup.class);
                startActivity(i);
                finish();
            }
        });
        loginbtn =(Button) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unm=uname.getText().toString();
                String lpas=pass.getText().toString();
                if (unm.isEmpty())
                {
                    uname.setError("Enter Username Correct");
                }
                else if (lpas.isEmpty())
                {
                    pass.setError("Enter Password Correct");
                }else {
                    Intent i = new Intent(getApplicationContext(), main.class);
                    startActivity(i);
                }

            }
        });
    }
}