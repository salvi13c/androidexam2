package com.example.androidexam2;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Calculator {

    public String selectop(String optype,String n1, String n2){
        String result="";
        if (optype.equals("add")){
            result=add(n1,n2);
        }else if (optype.equals("sub")){
            result=sub(n1,n2);
        }else if (optype.equals("mul")){
            result=mul(n1,n2);
        }else if (optype.equals("div")){
            result=div(n1,n2);
        }
        return result;
    }


    public String  add(String n1,String n2){
        String result="0";
        double n3;
        try{
            double n1d=Double.valueOf(n1);
            double n2d=Double.valueOf(n2);
            n3=n1d+n2d;
            result=String.valueOf(n3);
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
            result="ERROR";
        }


        return result ;
    }

    public String sub(String n1,String n2){
        String result="0";
        double n3;
        try{
            double n1d=Double.valueOf(n1);
            double n2d=Double.valueOf(n2);
            n3=n1d-n2d;
            result=String.valueOf(n3);
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
            result="ERROR";
        }


        return result ;
    }

    public String  mul(String n1,String n2){
        String result="0";
        double n3;
        try{
            double n1d=Double.valueOf(n1);
            double n2d=Double.valueOf(n2);
            n3=n1d*n2d;
            result=String.valueOf(n3);
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
            result="ERROR";
        }


        return result ;
    }

    public String  div(String n1,String n2){
        String result="0";
        double n3;
        try{
            double n1d=Double.valueOf(n1);
            double n2d=Double.valueOf(n2);
            if (n2d == 0) {
                throw new IllegalArgumentException("Argument 'divisor' is 0");
            }

            n3=n1d/n2d;
            result=String.valueOf(n3);
        }catch (Exception e){
            Log.d("error",Log.getStackTraceString(e));
            result="ERROR";
        }


        return result ;
    }
}
