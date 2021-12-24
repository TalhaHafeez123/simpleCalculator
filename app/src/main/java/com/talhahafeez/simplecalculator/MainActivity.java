package com.talhahafeez.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText num1, num2;
        Button add, sub, mul, div;
        TextView tv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            num1 = findViewById(R.id.num1);
            num2 = findViewById(R.id.num2);
            add = findViewById(R.id.add);
            sub = findViewById(R.id.sub);
            mul = findViewById(R.id.mul);
            div = findViewById(R.id.div);
            tv = findViewById(R.id.textview1);
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int f, s, ans;
                    f = Integer.parseInt(num1.getText().toString());
                    s = Integer.parseInt(num2.getText().toString());
                    ans = f + s;
                    tv.setText("Answer = " +ans);

                }
            });
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int f, s, ans;
                    f = Integer.parseInt(num1.getText().toString());
                    s = Integer.parseInt(num2.getText().toString());
                    ans = f - s;
                    tv.setText("Answer = " +ans);

                }
            });
            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int f, s, ans;
                    f = Integer.parseInt(num1.getText().toString());
                    s = Integer.parseInt(num2.getText().toString());
                    ans = f * s;
                    tv.setText("Result = " +ans);

                }
            });
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int f, s, ans;
                    f = Integer.parseInt(num1.getText().toString());
                    s = Integer.parseInt(num2.getText().toString());
                    ans = f / s;
                    tv.setText("Result = " +ans);

                }
            });


    }
}