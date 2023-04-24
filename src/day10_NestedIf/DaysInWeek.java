package day10_NestedIf;
import java.util.*;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        String day=(n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"wednesday":(n==4)?"Thursday":(n==5)?"Friday":(n==6)?"Saturday":"Sunday";
        System.out.println("day = " + day);;
    }
}
