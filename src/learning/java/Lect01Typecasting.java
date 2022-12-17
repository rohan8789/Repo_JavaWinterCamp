package learning.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lect01Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        if we input integer in float it will automatically
        int to float as int<float but vice versa is not true
        as int<float.

        To make vice versa true we need explicit typecasting
        */
        //float f = sc.nextFloat();
        //int n = sc.nextInt();

        //Typecasting-
        //compressing a bigger num into smaller
        //int m= (int)f;
        //System.out.println(m);

        //Automatic type promotion in exprssion
        int a= 257;
        byte b = (byte)a;//257%256==1

        byte x=50;
        byte y=40;
        byte z=100;
        int v=x*y/z;//but vice versa not true
        System.out.println(v);

        //wrapup
        byte p=42;
        char q='a';
        short r=1024;
        int s=50000;
        float t=5.67f;
        double u=0.1234;
        double res = t*b-s/q+u*r;
        //float -int +double = double
        System.out.println(t*b+" "+s/q+" "+u*r);


    }
}
