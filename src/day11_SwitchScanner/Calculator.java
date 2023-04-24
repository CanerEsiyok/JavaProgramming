package day11_SwitchScanner;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1= sc.nextInt();
        System.out.println("Enter the second number");
        int n2= sc.nextInt();
        System.out.println("Enter the arithmetic operator");
        char ch= sc.next().charAt(0);
        double result=0;
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            switch (ch){
                case '+':
                    result=n1+n2;
                    break;
                case '-':
                    result=n1-n2;
                    break;
                case '*':
                    result=n1*n2;
                    break;
                default:
                    result=(double) n1/n2;
                    break;

            }
        }else System.out.println("Invalid operator");
        System.out.println("result = " + result);
    }
}

