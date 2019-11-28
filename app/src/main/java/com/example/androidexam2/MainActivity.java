package com.example.androidexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Calculator CALC=new Calculator();
    String n1="0";
    int numberCalculating=1;
    String opertationtype="";
    String naux="0";
    boolean firstOp=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printResult(n1);
    }

    public void printResult(String result){
        TextView textreset=findViewById(R.id.result);
        textreset.setText(result);

    }

    public boolean firstOpVerify(){
        if (firstOp==true){
            firstOp=false;
            n1="";
            naux="";
        }
        if (numberCalculating==3){

        }

        return firstOp;
    }

    public void button_n1(View v){
        if (numberCalculating==1){
            firstOpVerify();
            n1=n1+"1";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"1";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }

    }

    public void button_n2(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "2";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"2";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }
    }
    public void button_n3(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "3";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"3";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }
    }

    public void button_n4(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "4";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"4";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }
    }
    public void button_n5(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "5";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"5";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }
    }

    public void button_n6(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "6";
            printResult(n1);
        }
        if (numberCalculating==2) {
            firstOpVerify();
            naux = naux + "6";
            printResult(n1);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }
    }
    public void button_n7(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "7";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"7";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }
    }

    public void button_n8(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "8";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"8";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }
    }
    public void button_n9(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "9";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"9";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }
    }

    public void button_n0(View v){
        if (numberCalculating==1) {
            firstOpVerify();
            n1 = n1 + "0";
            printResult(n1);
        }
        if (numberCalculating==2){
            firstOpVerify();
            naux=naux+"0";
            printResult(naux);
        }
        if (numberCalculating==3){
            String result=CALC.selectop(opertationtype,n1,naux);
            naux=result;
            n1=result;
            numberCalculating++;
            printResult(result);
        }

    }

    public void button_point(View v){
        if (numberCalculating==1){
        if (firstOp==false){
            n1=n1+".";
            printResult(n1);
        }
        }
        if (numberCalculating==2){
            if (firstOp==false){
                naux=naux+".";
                printResult(naux);
            }
        }

    }

    public void button_div(View v){
        numberCalculating=numberCalculating+1;
        opertationtype="div";
        if (numberCalculating>=3){
            button_result(v);
        }
    }

    public void button_mul(View v){
        numberCalculating=numberCalculating+1;
        opertationtype="mul";
        if (numberCalculating>=3){
            button_result(v);
        }
    }

    public void button_add(View v){
        numberCalculating=numberCalculating+1;
        opertationtype="add";
        if (numberCalculating>=3){
            button_result(v);
        }
    }

    public void button_sub(View v){
        numberCalculating=numberCalculating+1;
        opertationtype="sub";
        if (numberCalculating>=3){
            button_result(v);
        }
    }

    public void button_result(View v){
        String result=CALC.selectop(opertationtype,n1,naux);
        printResult(result);
    }

    public void button_delete(View v){
        firstOp=true;
        n1="0";
        naux="";
        numberCalculating=1;
        printResult(n1);
    }






}
