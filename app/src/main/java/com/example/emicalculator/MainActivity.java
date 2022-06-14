package com.example.emicalculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
     
public class MainActivity extends AppCompatActivity {

    EditText loan,rate,months;
    Button calculate;
    TextView result;
    private static final String TAG = "mainactivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loan = findViewById(R.id.etLoanAmount);
        rate = findViewById(R.id.etInterest);
        months = findViewById(R.id.months);
        calculate = findViewById(R.id.calculate);
        result = findViewById(R.id.Ans);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double p = Double.parseDouble(loan.getText().toString());
                Double n = Double.parseDouble(rate.getText().toString());
                Double r = Double.parseDouble(months.getText().toString());
                Double rate= (r/1200);
                Double res = (p * rate * Math.pow(1 + rate, n) / Math.pow(1 + rate, n) - 1);
                result.setText("EMI = "+String.valueOf(res));

            }
        });

    }
}