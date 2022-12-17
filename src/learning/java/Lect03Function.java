package learning.java;
import java.util.Scanner;
public class Lect03Function {

    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1=sc.nextInt();
        System.out.print("Enter num2: ");
        int n2=sc.nextInt();
        return n1+n2;
    }

    static void greet(){
        System.out.println("Good Night Rohan");
    }

    static void swap(int n, int m){
        int t=n;
        n=m;
        m=t;
    }

    public static void main(String[] args) {
        int ans=sum();
        System.out.println(ans);
        greet();

        //Pass by value
        int a=10;
        int b=20;
        swap(a,b);

        //Not changed as copy of object is passed, not actual object
        System.out.println(a+" "+b);
    }
}
