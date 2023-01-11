package com.example.juwapp.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.juwapp.R;
import com.example.juwapp.admin.AdminLogin;
import com.example.juwapp.user.Login;

public class MainActivity extends AppCompatActivity {
    ImageView adminprofile, userprofile;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adminprofile = findViewById(R.id.adminprofile);
        userprofile = findViewById(R.id.userprofile);
        logo = findViewById(R.id.logo);

        adminprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =  new Intent(MainActivity.this, AdminLogin.class);
                startActivity(intent);

            }
        });

        userprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Login.class);
                startActivity(intent);

            }
        });
    }
}