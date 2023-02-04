package com.ByRedCode.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     EditText editText1;
     EditText editText2;
     TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        textView = findViewById(R.id.sonuc);


    }



    public void topla(View view){
        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());

        int result = number1 + number2;

        textView.setText("Sonuc : " + result);
    }
    public void cikar(View view){
        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());

        int result = number1 - number2;

        textView.setText("Sonuc : " + result);




    }
    public void carpma(View view){
        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());

        int result = number1 * number2;

        textView.setText("Sonuc : " + result);
    }
    public void bolme(View view){
        double number1 = Double.parseDouble(editText1.getText().toString());
        double number2 = Double.parseDouble(editText2.getText().toString());

        double result = number1 / number2;

        textView.setText("Sonuc : " + result);
    }
}