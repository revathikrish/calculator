package com.mzc.stud.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculatorActivity extends AppCompatActivity {
    Button add,sub,mul,div,large,small;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        large=(Button)findViewById(R.id.large);
        small=(Button)findViewById(R.id.small);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),AddActivity.class);
                startActivity(a);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(getApplicationContext(),subActivity.class);
                startActivity(s);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(getApplicationContext(),mulActivity.class);
                startActivity(m);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d=new Intent(getApplicationContext(),divActivity.class);
                startActivity(d);
            }
        });
        large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(getApplicationContext(),largeActivity.class);
                startActivity(l);
            }
        });
        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sa=new Intent(getApplicationContext(),smallActivity.class);
                startActivity(sa);
            }
        });
    }
}
