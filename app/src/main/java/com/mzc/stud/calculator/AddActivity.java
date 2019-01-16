package com.mzc.stud.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
   EditText n1,n2,n3;
  Button bb1,bb2;
    String s1,s2,s3,s4;
    int number1,number2,number3,number4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        n1=(EditText)findViewById(R.id.num1);
        n2=(EditText)findViewById(R.id.num2);
        n3=(EditText)findViewById(R.id.num3);
        bb1=(Button)findViewById(R.id.ad);
        bb2=(Button)findViewById(R.id.b);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=n1.getText().toString();
                s2=n2.getText().toString();
                s3=n3.getText().toString();
                number1=Integer.parseInt(s1);
                number2=Integer.parseInt(s2);
                number3=Integer.parseInt(s3);
                number4=number1+number2+number3;
                s4=String.valueOf(number4);
                Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),calculatorActivity.class);
                startActivity(a);
            }
        });
    }
}
