package day10_NestedIf;
import java.util.*;

public class TernariesInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        String result=(n%2==0)? "Even":"Odd";
        System.out.println("------------------------------------");
        System.out.println(result);
        System.out.println("Enter your age");
        int age= sc.nextInt();
        String isEligible=(age>=21)? "Eligible":"Not eligible";
        System.out.println(isEligible);
        System.out.println("------------------------------------");
        System.out.println("Enter another number");
        int number= sc.nextInt();
        String result2=(number>0)?"Positive":(number<0)?"Negative":"Zero";
        System.out.println(result2);

    }
}
