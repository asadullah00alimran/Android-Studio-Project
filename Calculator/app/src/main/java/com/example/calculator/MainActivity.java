package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    Button b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_add,b_sub,b_mul,b_div,b_equal,b_point;
    TextView tv_display;
    double firstnum,secondnum,result;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_0=(Button) findViewById(R.id.btn_zero);
        b_1=(Button) findViewById(R.id.btn_1);
        b_2=(Button) findViewById(R.id.btn_2);
        b_3=(Button) findViewById(R.id.btn_3);
        b_4=(Button) findViewById(R.id.btn_4);
        b_5=(Button) findViewById(R.id.btn_5);
        b_6=(Button) findViewById(R.id.btn_6);
        b_7=(Button) findViewById(R.id.btn_7);
        b_8=(Button) findViewById(R.id.btn_8);
        b_9=(Button) findViewById(R.id.btn_9);
        b_point=(Button) findViewById(R.id.btn_point);

        b_add=(Button) findViewById(R.id.btn_add);
        b_sub=(Button) findViewById(R.id.btn_sub);
        b_mul=(Button) findViewById(R.id.btn_mul);
        b_div=(Button) findViewById(R.id.btn_div);

        b_equal=(Button) findViewById(R.id.btn_equal);

        tv_display=(TextView) findViewById(R.id.display);
    }
    public void method_zero(View view)
    {
        String input =tv_display.getText()+"0";
        tv_display.setText(input);
    }
    public void method_1(View view)
    {
        String input =tv_display.getText()+"1";
        tv_display.setText(input);
    }
    public void method_2(View view)
    {
        String input =tv_display.getText()+"2";
        tv_display.setText(input);
    }
    public void method_3(View view)
    {
        String input =tv_display.getText()+"3";
        tv_display.setText(input);
    }
    public void method_4(View view)
    {
        String input =tv_display.getText()+"4";
        tv_display.setText(input);
    }
    public void method_5(View view)
    {
        String input =tv_display.getText()+"5";
        tv_display.setText(input);
    }
    public void method_6(View view)
    {
        String input =tv_display.getText()+"6";
        tv_display.setText(input);
    }
    public void method_7(View view)
    {
        String input =tv_display.getText()+"7";
        tv_display.setText(input);
    }
    public void method_8(View view)
    {
        String input =tv_display.getText()+"8";
        tv_display.setText(input);
    }
    public void method_9(View view)
    {
        String input =tv_display.getText()+"9";
        tv_display.setText(input);
    }
    public void method_point(View view)
    {
        String input =tv_display.getText()+".";
        tv_display.setText(input);
    }
    public void method_add(View view)
    {  firstnum=Double.parseDouble(tv_display.getText().toString());
        tv_display.setText("");
        operation="+";
    }
    public void method_sub(View view)
    {
        firstnum=Double.parseDouble(tv_display.getText().toString());
        tv_display.setText("");
        operation="-";
    }
    public void method_mul(View view)
    {
        firstnum=Double.parseDouble(tv_display.getText().toString());
        tv_display.setText("");
        operation="*";
    }
    public void method_div(View view)
    {
        firstnum=Double.parseDouble(tv_display.getText().toString());
        tv_display.setText("");
        operation="/";
    }
    public void method_equal(View view)
    {
        String answer;
        secondnum=Double.parseDouble(tv_display.getText().toString());
        switch (operation)
        {
            case "+":
                result=firstnum+secondnum;
                answer=String.format("%.0f",result);
                tv_display.setText(answer);
                break;
            case "-":
                result=firstnum-secondnum;
                answer=String.format("%.0f",result);
                tv_display.setText(answer);
                break;
            case "*":
                result=firstnum*secondnum;
                answer=String.format("%.0f",result);
                tv_display.setText(answer);
                break;
            case "/":
                result=firstnum/secondnum;
                answer=String.format("%.0f",result);
                tv_display.setText(answer);
                break;
        }
    }
}