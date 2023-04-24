package day11_SwitchScanner;
import java.util.*;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        String day;
        switch (n){
            case 1:
                day="Monday";
            break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day="Invalid number";
                break;




        }
        System.out.println("day = " + day);

    }
}
