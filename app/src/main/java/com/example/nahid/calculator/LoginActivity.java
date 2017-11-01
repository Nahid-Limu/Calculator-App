package com.example.nahid.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText uesrName,uesrPass;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uesrName = (EditText) findViewById(R.id.uesrName);
        uesrPass = (EditText) findViewById(R.id.uesrPass);
        btn_login = (Button) findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String un = "admin";
                int pass = 12345;

                if(uesrName.getText().toString().equals(un) && Integer.parseInt(uesrPass.getText().toString())==pass){
                    Log.e("username", uesrName.getText().toString());
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"Wrong User Name Or Password...!!!",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
