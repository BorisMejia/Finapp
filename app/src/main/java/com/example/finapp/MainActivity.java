package com.example.finapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    TextView txtLogIn;
    EditText txtName, txtEmail, txtPassword;
    Button btnSingUp;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText) findViewById(R.id.txtName);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        txtLogIn = (TextView) findViewById(R.id.txtLogIn);
        btnSingUp = (Button) findViewById(R.id.btnSignUp);

        txtLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, iLogin.class);
                startActivity(intento);
            }
        });
        btnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //inicializarFirebase();

    }


}