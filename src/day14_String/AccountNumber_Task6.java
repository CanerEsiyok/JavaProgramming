package day14_String;

import java.util.Scanner;

public class AccountNumber_Task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Account number:");
        String number=sc.nextLine();
        if(number.charAt(0)=='2') {
            if (number.length() == 7)
                System.out.println("valid");
            else System.out.println("invalid");
        }
        else if(number.charAt(0)=='5') {
            if(number.length()==10)
                System.out.println("valid");
            else System.out.println("invalid");
        }
        else System.out.println("Invalid");
    }
}
