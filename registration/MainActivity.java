package com.example.sjcet.regiistration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email,password,username,gender,dob;
    Button signup,signfb;
    Boolean bemail,bpass,buname,bgender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        username= (EditText) findViewById(R.id.username);
        dob= (EditText) findViewById(R.id.dob);
        gender= (EditText) findViewById(R.id.gender);
        signup = (Button) findViewById(R.id.signup);
        signfb = (Button) findViewById(R.id.signfb);

    }


    public void signup(View view) {
        Boolean res_val = validate();
        if(res_val == true){
            SharedPreferences sharedPreferences = getSharedPreferences("Demo",0);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("Email",email.getText().toString());
            editor.putString("Password",password.getText().toString());
            editor.putString("Username",username.getText().toString());
            editor.putString("DateOfBirth",dob.getText().toString());
            editor.putString("Gender",gender.getText().toString());
            editor.apply();
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    }

    private boolean validate() {
        if(email == null){
            return false;
        }
        if(password == null){
            return false;
        }
        if(username == null){
            return false;
        }
        if(gender == null){
            return false;
        }

        else {
            return true;
        }
    }

    public void signfb(View view) {
        Intent intent2 = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent2);
    }
}
