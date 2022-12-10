package com.example.mycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {
    private static final char add = '+';
    private static final char sub = '-';
    private static final char mul = '*';
    private static final char div = '/';
    private static final char pourcent = '%';

    private char currentSymbol;
    private double firstValue = Double.NaN;

    double secondValue;
    DecimalFormat decimalFormat;

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bpoint, begal, bplus, bsous, bmul,
            bdiv, bc, bac , bmodul;
    TextView tvmain, tvsec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        decimalFormat = new DecimalFormat("#.#########");
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bc = findViewById(R.id.bc);
        bpoint = findViewById(R.id.bpt);
        bac = findViewById(R.id.bac);
        tvmain = findViewById(R.id.tvmain);
        begal = findViewById(R.id.begal);
        tvsec = findViewById(R.id.tvsec);
        bplus = findViewById(R.id.badd);
        bsous = findViewById(R.id.bsous);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        bmodul = findViewById(R.id.bmodulo);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "0");
            }
        });

        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + ".");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Callculations();
                currentSymbol = add;
                tvsec.setText(decimalFormat.format(firstValue) + "+");
                tvmain.setText(null);
            }
        });

        bsous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Callculations();
                currentSymbol = sub;
                tvsec.setText(decimalFormat.format(firstValue) + "-");
                tvmain.setText(null);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Callculations();
                currentSymbol = mul;
                tvsec.setText(decimalFormat.format(firstValue) + "×");
                tvmain.setText(null);

            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Callculations();
                currentSymbol = div;
                tvsec.setText(decimalFormat.format(firstValue) + "÷");
                tvmain.setText(null);
            }
        });

        bmodul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Callculations();
                currentSymbol = pourcent;
                tvsec.setText(decimalFormat.format(firstValue) + "%");
                tvmain.setText(null);

            }
        });

        begal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Callculations();
                tvsec.setText(decimalFormat.format(firstValue));
                firstValue = Double.NaN;
                currentSymbol = '0';
            }
        });
    }
    private void Callculations(){
        if(!Double.isNaN(firstValue)){
            secondValue = Double.parseDouble(tvmain.getText().toString());
            tvmain.setText(null);

            if(currentSymbol == add)
                firstValue = this.firstValue + secondValue;
            else if(currentSymbol == sub)
                firstValue = this.firstValue - secondValue;
            else if (currentSymbol == mul)
                firstValue = this.firstValue * secondValue;
            else if (currentSymbol == div)
                firstValue = this.firstValue / secondValue;
            else if (currentSymbol == pourcent)
                firstValue = this.firstValue % secondValue;
        }else{
            try{
                firstValue = Double.parseDouble(tvmain.getText().toString());
            }catch(Exception e){

            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.standard:
                break;
            case R.id.Scientifique:
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}