package day09_IfStatements;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= n1.nextInt();
        Scanner n2=new Scanner(System.in);
        System.out.println("Enter the second number");
        int b=n2.nextInt();
       Scanner ch=new Scanner(System.in);
        System.out.println("Enter the math operator");
        char mathOperator=ch.next().charAt(0);
      // char mathOperator='/';
        if(mathOperator=='+'){
            System.out.println(a+b);

    }else if(mathOperator=='-'){
            System.out.println(a-b);
        } else if (mathOperator=='*') {
            System.out.println(a*b);

        } else if (mathOperator=='/') {
            System.out.println((double) a/b);

        }else {
            System.out.println("invalid operator");
    }}}
