package com.example.dostor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        if(EnterA.isEmpty()||!TextUtils.isDigitsOnly(EnterA)||EnterA.isEmpty()||!TextUtils.isDigitsOnly(EnterA)) {
            Toast.makeText(this, "Check data you entered", Toast.LENGTH_SHORT).show();
            return;
        }
        if(EnterB.isEmpty()||!TextUtils.isDigitsOnly(EnterB)||EnterB.isEmpty()||!TextUtils.isDigitsOnly(EnterB)) {
            Toast.makeText(this, "Check data you entered", Toast.LENGTH_SHORT).show();
            return;
        }
        if(EnterC.isEmpty()||!TextUtils.isDigitsOnly(EnterC)||EnterC.isEmpty()||!TextUtils.isDigitsOnly(EnterC)) {
            Toast.makeText(this, "Check data you entered", Toast.LENGTH_SHORT).show();
            return;
        }
        double a1, b1, c1, calc, delta, calc1;
        a1 = Double.parseDouble(EnterA);
        b1 = Double.parseDouble(EnterB);
        c1 = Double.parseDouble(EnterC);
        delta = (b1 * b1) - (4 * a1 * c1);
        if (delta == 0) {
            calc = (-1 * b1) / (2 * a1);
            Toast.makeText(this, "Root are" + calc, Toast.LENGTH_SHORT).show();
        } else if (delta > 0) {
            calc = ((-1 * b1) - Math.sqrt(delta)) / (2 * a1);
            Toast.makeText(this, "Root are" + calc, Toast.LENGTH_SHORT).show();
            calc1 = ((-1 * b1) + Math.sqrt(delta)) / (2 * a1);
            Toast.makeText(this, "Root are" + calc1, Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, "There is no roots", Toast.LENGTH_SHORT).show();
    }
}