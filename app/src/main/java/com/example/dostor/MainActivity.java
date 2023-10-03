package com.example.dostor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etA,etB,etC;
    Button btCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        connectComponents();
    }

    private void connectComponents() {
        etA= findViewById(R.id.etA);
        etB= findViewById(R.id.etB);
        etC= findViewById(R.id.etC);
        btCalc= findViewById(R.id.btCalc);
    }

    public void Calculate(View view) {
        String EnterA = etA.getText().toString();
        String EnterB = etB.getText().toString();
        String EnterC = etC.getText().toString();
        double a,b,c,calc;
        a=Double.parseDouble(a);
        b=Double.parseDouble(b);
        c=Double.parseDouble(c);
    }
}