package com.mzc.stud.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class subActivity extends AppCompatActivity {
    EditText n1,n2;
    Button bb1,bb2;
    String s1,s2,s3;
    int number1,number2,number3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        n1=(EditText)findViewById(R.id.nu1);
        n2=(EditText)findViewById(R.id.nu2);;
        bb1=(Button)findViewById(R.id.su);
        bb2=(Button)findViewById(R.id.ba);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=n1.getText().toString();
                s2=n2.getText().toString();
                number1=Integer.parseInt(s1);
                number2=Integer.parseInt(s2);
                number3=number1-number2;
                s3=String.valueOf(number3);
                Toast.makeText(getApplicationContext(),s3, Toast.LENGTH_LONG).show();
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(getApplicationContext(),calculatorActivity.class);
                startActivity(s);
            }
        });
    }
}
