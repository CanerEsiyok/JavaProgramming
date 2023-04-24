package day10_NestedIf;
import java.util.*;

public class NameOfMonth2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        //parenthesis is optional
        String month=n==1?"January":n==2?"February":n==3?"March":n==4?"April":n==5?"May":n==6?"June":(n==7)?"July"
                :(n==8)?"August":(n==9)?"September":(n==10)?"October":(n==11)?"November":"December";
        System.out.println("month = " + month);
    }
}
