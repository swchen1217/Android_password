package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btndel;
    Button btnok;
    TextView input;
    ImageView iv;
    String pw="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(listener);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(listener);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(listener);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(listener);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(listener);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(listener);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(listener);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(listener);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(listener);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(listener);
        btndel = (Button) findViewById(R.id.btndel);
        btnok = (Button) findViewById(R.id.btnok);
        input = (TextView) findViewById(R.id.editText2);
        iv = (ImageView) findViewById(R.id.imageView2);
    }
    Button.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button tmp = (Button) findViewById(v.getId());
            input.setText(input.getText().toString() + tmp.getText().toString());
        }
    };
    public void del(View view) {
        input.setText("");
    }
    public void ok(View view) {
        String in=input.getText().toString();
        if(in.equals(pw))
        {
            iv.setImageResource(R.drawable.img02);
            Toast toast = Toast.makeText(this, "解鎖成功!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,0);   //靠右下用法
            toast.show();
            input.setText("");
        }
        else{
            iv.setImageResource(R.drawable.img01);
            Toast toast = Toast.makeText(this, "密碼錯誤!", Toast.LENGTH_SHORT);
            toast.show();
            input.setText("");
        }
    }
}
