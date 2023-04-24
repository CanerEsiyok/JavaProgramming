package day12_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents= sc.nextInt();
        String result;
        if (cents%100!=0) {
            if (cents/100>1)
                 result = cents + " cents equal to: " + cents / 100 + " dollars and " + cents % 100 + " cents";
            else  result = cents + " cents equal to: " + cents / 100 + " dollar and " + cents % 100 + " cents";
        } else result=cents+" cents equal to: "+cents/100+" dollars";
        System.out.println(result);

    }
}
