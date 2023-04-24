package day10_NestedIf;
import java.util.*;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score");
        int n= sc.nextInt();
        String result=n>=0&&n<=100? n>=60?"Passed":"Failed":"Invalid Score";
        System.out.println("result = " + result);

    }
}
