package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 Button b1, b2, b3, b4;
 EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        ed3=(EditText)findViewById(R.id.ed3);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
    }
    public int n1(){
        String n=ed1.getText().toString();
        int le=n.length();
        String n2=n.substring(4,le);
        int num1=Integer.parseInt(n2);
        return num1;
    }

    public int n2(){
        String n=ed2.getText().toString();
        int le=n.length();
        String n2=n.substring(4,le);
        int num2=Integer.parseInt(n2);
        return num2;
    }

    public void b1(View v){
        int total=n1()+n2();
        ed3.setText("sum:"+total);
    }
    public void b2(View v){
        int total=n1()-n2();
        ed3.setText("sum:"+total);
    }
    public void b3(View v){
        int total=n1()*n2();
        ed3.setText("sum:"+total);
    }
    public void b4(View v){
        if(n2()!=0){
        double total=(double)n1()/(double)n2();
        ed3.setText("sum:"+total);}
        else {
            ed3.setText("sum: 0");
            }
        }


}//close