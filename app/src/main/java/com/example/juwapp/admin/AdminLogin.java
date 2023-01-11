package com.example.juwapp.admin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.juwapp.user.DashboardActivity;
import com.example.juwapp.R;

public class AdminLogin extends AppCompatActivity {
    EditText adminId, adminPass;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        adminId = (EditText) findViewById(R.id.adminID);
        adminPass = (EditText) findViewById(R.id.adminPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (adminId.getText().toString().equals("12345") && adminPass.getText().toString().equals("admin125")) {
                    //correct
                    Toast.makeText(AdminLogin.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(AdminLogin.this, AdminDashboardActivity.class);
                    startActivity(intent);
                } else
                    //incorrect
                    Toast.makeText(AdminLogin.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}