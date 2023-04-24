package day11_SwitchScanner;
import java.util.*;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
       String result= n>=0&&n<=9?n==0?"Zero":n==1?"One":n==2?"Two":n==3?"Three":n==4?"Four":n==5?"Five":n==6?"Six":n==7?"Seven":
               n==8?"Eight":"Nine":"Invalid number";
        System.out.println("result = " + result);

    }
}
