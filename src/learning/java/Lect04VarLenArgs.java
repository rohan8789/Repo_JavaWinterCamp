package learning.java;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Lect04VarLenArgs {

    static void varArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multipleArgs(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }


    public static void main(String[] args) {
        //Multiple undefined number of arguments
        varArgs(2,3,4,5,6,7,8);
        multipleArgs(2, 4,"rohan", "singh", "abc");
    }
}
