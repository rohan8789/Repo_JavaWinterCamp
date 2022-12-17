package lecture;

import java.util.Scanner;
public class lect5 {
//    static void domoreStuff(){
////        System.out.println(10/0);
//    }
//    static void dostuff(){
//        domoreStuff();
//    }

    public static void main(String[] args) {
        //dostuff();
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter integer: ");
            int n=sc.nextInt();
        }catch (Exception e){
            System.out.println("It is number format exception"+e);
        }
    }
}
