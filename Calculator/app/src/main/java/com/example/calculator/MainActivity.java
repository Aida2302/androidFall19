package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputNumber;

    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonNumber0;

    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;

    private Button buttonPercent;
    private Button buttonSquare;
    private Button buttonSqrt;
    private Button buttonDot;

    private Button buttonDelete;
    private Button buttonEqual;

    private double number1;
    private double number2;
    private double result;
    private boolean check = true;

    enum Sign {
        PLUS, MINUS, MULTIPLY, DIVIDE, SQUARE, SQRT, PERCENT
    }
    private Sign sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.numberInput);

        buttonNumber0 = findViewById(R.id.buttonNumber0);
        buttonNumber1 = findViewById(R.id.buttonNumber1);
        buttonNumber2 = findViewById(R.id.buttonNumber2);
        buttonNumber3 = findViewById(R.id.buttonNumber3);
        buttonNumber4 = findViewById(R.id.buttonNumber4);
        buttonNumber5 = findViewById(R.id.buttonNumber5);
        buttonNumber6 = findViewById(R.id.buttonNumber6);
        buttonNumber7 = findViewById(R.id.buttonNumber7);
        buttonNumber8 = findViewById(R.id.buttonNumber8);
        buttonNumber9 = findViewById(R.id.buttonNumber9);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);

        buttonPercent = findViewById(R.id.buttonPercent);
        buttonSquare = findViewById(R.id.buttonSquare);
        buttonSqrt = findViewById(R.id.buttonSqrt);
        buttonDot = findViewById(R.id.buttonDot);

        buttonDelete = findViewById(R.id.buttonDelete);
        buttonEqual = findViewById(R.id.buttonEqual);

        buttonNumber0.setOnClickListener(this);
        buttonNumber1.setOnClickListener(this);
        buttonNumber2.setOnClickListener(this);
        buttonNumber3.setOnClickListener(this);
        buttonNumber4.setOnClickListener(this);
        buttonNumber5.setOnClickListener(this);
        buttonNumber6.setOnClickListener(this);
        buttonNumber7.setOnClickListener(this);
        buttonNumber8.setOnClickListener(this);
        buttonNumber9.setOnClickListener(this);

        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);

        buttonPercent.setOnClickListener(this);
        buttonSquare.setOnClickListener(this);
        buttonSqrt.setOnClickListener(this);
        buttonDot.setOnClickListener(this);

        buttonDelete.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

//        if(inputNumber.getText().toString().equals("0")) {
//            inputNumber.setText("");
//        }

        switch (v.getId()) {
            case R.id.buttonNumber0: {
                inputNumber.append("0");
                break;
            }
            case R.id.buttonNumber1: {
                inputNumber.append("1");
                break;
            }
            case R.id.buttonNumber2: {
                inputNumber.append("2");
                break;
            }
            case R.id.buttonNumber3: {
                inputNumber.append("3");
                break;
            }
            case R.id.buttonNumber4: {
                inputNumber.append("4");
                break;
            }
            case R.id.buttonNumber5: {
                inputNumber.append("5");
                break;
            }
            case R.id.buttonNumber6: {
                inputNumber.append("6");
                break;
            }
            case R.id.buttonNumber7: {
                inputNumber.append("7");
                break;
            }
            case R.id.buttonNumber8: {
                inputNumber.append("8");
                break;
            }
            case R.id.buttonNumber9: {
                inputNumber.append("9");
                break;
            }
            case R.id.buttonDot: {
                inputNumber.append(".");
                break;
            }
            case R.id.buttonPlus: {
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.PLUS;
                break;
            }
            case R.id.buttonMinus: {
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.MINUS;
                break;
            }
            case R.id.buttonMultiply: {
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.MULTIPLY;
                break;
            }
            case R.id.buttonDivide: {
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.DIVIDE;
                break;
            }
            case R.id.buttonEqual: {
                number2 = Integer.parseInt(inputNumber.getText().toString());
                if(sign == Sign.PLUS) {
                    result = number1 + number2;
                }
                if(sign == Sign.MINUS) {
                    result = number1 - number2;
                }
                if(sign == Sign.MULTIPLY) {
                    result = number1 * number2;
                }
                if(sign == Sign.DIVIDE) {
                    if(number2 == 0) {
                        inputNumber.setText("Error");
                        break;
                    } else result = number1 / number2;
                }
                inputNumber.setText(String.valueOf(result));
                break;
            }
            case R.id.buttonSquare: {
                number1 = Integer.parseInt(inputNumber.getText().toString());
                result = number1*number1;
                inputNumber.setText(String.valueOf(result));
                break;
            }
            case R.id.buttonSqrt: {
                number1 = Double.parseDouble(inputNumber.getText().toString());
                result = Math.sqrt(number1);
                inputNumber.setText(String.valueOf(result));
                break;
            }
            case R.id.buttonDelete: {
                inputNumber.setText("");
                break;
            }
        }

    }
}