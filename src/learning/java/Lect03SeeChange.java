package learning.java;

public class Lect03SeeChange {

    static void swap(int a, int b){
        int t=a;
        a=b;
        b=t;
    }

    public static void main(String[] args) {
        Lect03SeeChange se = new Lect03SeeChange();
        int a=10;
        int b=20;
        se.swap(a,b);
        System.out.println(a+" "+b);

        //checkout scoping, shadowing and variable length arguments
        //method vs block
    }
}
