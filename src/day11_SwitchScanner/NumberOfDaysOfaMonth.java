package day11_SwitchScanner;
import java.util.*;

public class NumberOfDaysOfaMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month");
        int n= sc.nextInt();
        System.out.println("Enter the year");
        int year= sc.nextInt();
        String month="";
        if (n>=1&&n<=12){

        switch (n){
            case 2:
               /* if (year%4==0){
                    month="29 days";
                } else
                month="28 days";*/
                month=(year%4==0)?"29 days":"28 days";
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                month="31 days";
                break;

            default:
                month="Invalid number";
                break;

        } } else month="invalid";
        System.out.println("month = " + month);

    }
}
