package com.example.sjcet.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname,password;
    Button submit;
    TextView textView;
    MyDatabase database = new MyDatabase(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname =(EditText)findViewById(R.id.uname);
        password =(EditText)findViewById(R.id.password);
        submit = (Button)findViewById(R.id.submit);


    }
    public void submit(View view) {
        String uname_user = uname.getText().toString();
        String password_user = password.getText().toString();
        Toast.makeText(getApplicationContext(),"Successful",Toast.LENGTH_LONG).show();
    }
}
