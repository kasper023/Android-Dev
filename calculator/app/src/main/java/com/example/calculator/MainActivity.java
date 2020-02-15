package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String sign,value1,value2, value4;
    Double num1,num2,result;
    boolean hasdot, signBool, zeroBool;

    TextView input,signBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=(TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sign);
        hasdot = false;
        signBool = false;
        zeroBool = false;

        if(savedInstanceState != null)
        {
            sign = savedInstanceState.getString("sign");
            value1 = savedInstanceState.getString("value1");
            value2 = savedInstanceState.getString("value2");
            value4 = savedInstanceState.getString("value4");
            num1 = savedInstanceState.getDouble("num1");
            num2 = savedInstanceState.getDouble("num2");
            result = savedInstanceState.getDouble("result");
            hasdot = savedInstanceState.getBoolean("hasdot");
            signBool = savedInstanceState.getBoolean("signBool");
            zeroBool = savedInstanceState.getBoolean("zeroBool");
            signBox.setText(sign);
            if(sign != null)
            {
                input.setText(value2);
            }
            else
            {
                input.setText(value1);
            }
        }

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState)
    {
        super.onSaveInstanceState(outState);
        if(sign != null)
        {
            outState.putString("sign",sign);
        }
        if(input.getText() != null)
        {
            if(input.getText().equals(""))
            {

            }
            else if (value1 == null)
            {
                value1 = input.getText().toString();
                outState.putString("value1",value1);
            }
            else
            {
                outState.putString("value1",value1);
            }
        }
        if(input.getText() != null && value1 != null)
        {
            if(input.getText().equals(""))
            {

            }
            else
            {
                value2 = input.getText().toString();
                outState.putString("value2",value2);
            }
        }
        if(value1 != null)
        {
            value4 = value1;
            outState.putString("value4",value4);
        }
        if(num1 != null)
        {
            outState.putDouble("num1",num1);
        }
        if(num2 != null)
        {
            outState.putDouble("num2",num2);
        }
        if(result != null)
        {
            outState.putDouble("result",result);
        }
        outState.putBoolean("hasdot",hasdot);
        outState.putBoolean("signBool",signBool);
        outState.putBoolean("zeroBool",zeroBool);
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        if (input.getText().equals("0"))
        {
            signBox.setText("");
        }
        else
        {
            input.setText(input.getText() + "0");
            zeroBool = false;
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "1");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "1");
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "2");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "2");
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "3");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "3");
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "4");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "4");
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "5");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "5");
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "6");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "6");
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "7");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "7");
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "8");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "8");
            signBox.setText("");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view)
    {
        if (input.getText().equals("0"))
        {
            input.setText(null);
            input.setText(input.getText() + "9");
            signBox.setText("");
        }
        else {
            input.setText(input.getText() + "9");
            signBox.setText("");
        }
    }

    public void btnClick_dot(View view) {
        if (hasdot == false)
        {
            hasdot = true;
            if(input.getText().equals(""))
            {
                input.setText((input.getText() + "0."));
            }
            else
            {
                input.setText(((input.getText() + ".")));
            }
        }
    }

    public void btnClick_add(View view)
    {
        if(signBool == false)
        {
            if(input.getText().equals(""))
            {
                value1 = "0";
                sign = "+";
                input.setText(null);
                signBox.setText("+");
                hasdot = false;
                signBool = true;
            }
            else {
                sign = "+";
                value1 = input.getText().toString();
                input.setText(null);
                signBox.setText("+");
                hasdot = false;
                signBool = true;
                value4 = value1;

            }
        }
        else
        {
            input.setText("");
            value1 = value4;
            sign = "+";
            signBox.setText("+");
        }

    }

    public void btnClick_multiply(View view)
    {
        if(signBool == false)
        {
            if(input.getText().equals(""))
            {
                value1 = "0";
                sign = "*";
                input.setText(null);
                signBox.setText("*");
                hasdot = false;
                signBool = true;
            }
            else {
                sign = "*";
                value1 = input.getText().toString();
                input.setText(null);
                signBox.setText("*");
                hasdot = false;
                value4 = value1;
            }
        }
        else
        {
            input.setText("");
            value1 = value4;
            sign = "*";
            signBox.setText("*");
        }
    }

    public void btnClick_substract(View view)
    {
        if(signBool == false)
        {
            if(input.getText().equals(""))
            {
                value1 = "0";
                sign = "-";
                input.setText(null);
                signBox.setText("-");
                hasdot = false;
                signBool = true;
            }
            else {
                sign = "-";
                value1 = input.getText().toString();
                input.setText(null);
                signBox.setText("-");
                hasdot = false;
                value4 = value1;
            }
        }
        else
        {
            input.setText("");
            value1 = value4;
            sign = "-";
            signBox.setText("-");
        }
    }

    public void btnClick_divide(View view)
    {
        if(signBool == false)
        {
            if(input.getText().equals(""))
            {
                value1 = "0";
                sign = "/";
                input.setText(null);
                signBox.setText("/");
                hasdot = false;
                signBool = true;
            }
            else {
                sign = "/";
                value1 = input.getText().toString();
                input.setText(null);
                signBox.setText("/");
                hasdot = false;
                value4 = value1;
            }
        }
        else
        {
            input.setText("");
            value1 = value4;
            sign = "/";
            signBox.setText("/");
        }
    }

    public void btnClick_sqr(View view)
    {
        if (input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals("Error!"))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            double num3 = Double.parseDouble(value3);
            result = num3 * num3;
            input.setText(result + "");
            result = null;
        }
    }

    public void btnClick_sqrt(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals(("Error!")))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            double num3 = Double.parseDouble(value3);
            if(num3 < 0)
            {
                signBox.setText("Error!");
            }
            else
            {
                result = Math.sqrt(num3);
                input.setText(result + "");
                result = null;
            }
        }
    }


    public void btnClick_sin(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals(("Error!")))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            double num3 = Double.parseDouble(value3);
            result = Math.sin(num3);
            input.setText(result + "");
            result = null;
        }
    }

    public void btnClick_cos(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals(("Error!")))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            double num3 = Double.parseDouble(value3);
            result = Math.cos(num3);
            input.setText(result + "");
            result = null;
        }
    }

    public void btnClick_tan(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals(("Error!")))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            double num3 = Double.parseDouble(value3);
            result = Math.tan(num3);
            input.setText(result + "");
            result = null;
        }
    }

    public void btnClick_percent(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals(("Error!")))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            double num3 = Double.parseDouble(value3);
            result = num3 * 0.01;
            input.setText(result + "");
            result = null;
        }
    }

    public void btnClick_ln(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals(("Error!")))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            double num3 = Double.parseDouble(value3);
            if(num3 <= 0)
            {
                signBox.setText("Error!");
            }
            else
            {
                result = Math.log(num3);
                input.setText(result + "");
                result = null;
            }
        }
    }

    public void btnClick_log(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals(("Error!")))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            double num3 = Double.parseDouble(value3);
            if(num3 <= 0)
            {
                signBox.setText("Error!");
            }
            else
            {
                result = Math.log10(num3);
                input.setText(result + "");
                result = null;
            }
        }
    }

    public void btnClick_sqr_n(View view)
    {
        if(signBool == false)
        {
            if(input.getText().equals(""))
            {
                value1 = "0";
                sign = "^m";
                input.setText(null);
                signBox.setText("^m");
                hasdot = false;
                signBool = true;
            }
            else {
                sign = "^m";
                value1 = input.getText().toString();
                input.setText(null);
                signBox.setText("^m");
                hasdot = false;
                value4 = value1;
            }
        }
        else
        {
            input.setText("");
            value1 = value4;
            sign = "^m";
            signBox.setText("^m");
        }
    }


    public void btnClick_sqrt_n(View view)
    {
        if(signBool == false)
        {
            if(input.getText().equals(""))
            {
                value1 = "0";
                sign = "n√";
                input.setText(null);
                signBox.setText("n√");
                hasdot = false;
                signBool = true;
            }
            else {
                sign = "n√";
                value1 = input.getText().toString();
                input.setText(null);
                signBox.setText("n√");
                hasdot = false;
                value4 = value1;
            }
        }
        else
        {
            input.setText("");
            value1 = value4;
            sign = "n√";
            signBox.setText("n√");
        }
    }

    public void btnClick_factorial(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else
        {
            if(signBox.getText().equals(("Error!")))
            {
                signBox.setText("");
            }
            String value3 = input.getText().toString();
            int num3 = Integer.parseInt(value3);
            int c = 1;
            for (int i = 2; i <= num3; i++)
            {
                c = c * i;
            }
            result = Double.valueOf(c);
            input.setText(result + "");
            result = null;
        }
    }



    public void btnClick_equal(View view)
    {
        if(input.getText().equals(""))
        {
            signBox.setText("Error!");
        }
        else if(sign != null)
        {
            value2 = input.getText().toString();
            num1 = Double.parseDouble(value1);
            num2 = Double.parseDouble(value2);
            input.setText(null);

            switch (sign)
            {
                default:
                    break;
                case "+":
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    hasdot = true;
                    signBool = false;
                    break;
                case "-":
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    hasdot = true;
                    signBool = false;
                    break;
                case "*":
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    hasdot = true;
                    signBool = false;
                    break;
                case "/":
                    if(num2 == 0)
                    {
                        signBox.setText("Can`t be divided by 0");
                    }
                    else {
                        result = num1 / num2;
                        input.setText(result + "");
                        sign = null;
                        signBox.setText(null);
                        hasdot = true;
                        signBool = false;
                        break;
                    }
                case "^m":
                    result = Math.pow(num1,num2);
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    hasdot = true;
                    signBool = false;
                    break;
                case "n√":
                    num2 = 1.0 / num2;
                    result = Math.pow(num1,num2);
                    String fresult = String.format("%.2f",result);
                    input.setText(fresult);
                    sign = null;
                    signBox.setText(null);
                    hasdot = true;
                    signBool = false;
                    break;
            }
        }
        else input.setText("Error!");
    }

    public void btnClick_delAll(View view)
    {
        input.setText(null);
        value1 = null;
        value2 = null;
        hasdot = false;
        signBox.setText(null);
        sign = null;
    }

    public void btnClick_del(View view)
    {
        if(input.getText().equals(""))
        {
            input.setHint("0");
        }
        else
        {
            int len = input.getText().length();
            String s = input.getText().toString();
            if(s.charAt((len-1)) == '.')
            {
                hasdot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
            else
            {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
        }
    }

}
