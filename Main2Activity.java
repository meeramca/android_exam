package com.example.sjcet.regiistration;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv;
    String email,password,username,dob,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences sharedPreferences = getSharedPreferences("Demo",0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        email = sharedPreferences.getString("Email","default value..");
        password = sharedPreferences.getString("Password","default value..");
        username = sharedPreferences.getString("Username","default value..");
        dob = sharedPreferences.getString("DateOfBirth","default value..");
        gender = sharedPreferences.getString("Gender","default value..");
        tv.setText(tv.getText()+email);
        tv.setText(tv.getText()+password);
        tv.setText(tv.getText()+username);
        tv.setText(tv.getText()+dob);
        tv.setText(tv.getText()+gender);

    }
}
