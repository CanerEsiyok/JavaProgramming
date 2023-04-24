package day09_IfStatements;
import java.util.*;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= n1.nextInt();
        Scanner n2=new Scanner(System.in);
        System.out.println("Enter the second number");
        int b= n2.nextInt();
        Scanner n3=new Scanner(System.in);
        System.out.println("Enter the third number");
        int c= n3.nextInt();
        if(a==b&&b==c){
            System.out.println("all equal");
        }else if(a==b&&a!=c){
            System.out.println(a+" and "+b+" are equal");

    } else if (b==c&&a!=b) {
            System.out.println(b+" and "+c+" are equal");
            
        } else if (a==c&&a!=b) {
            System.out.println(a+" and "+c+" are equal");

        }else {
            System.out.println("none of them equal");

    }}}
