package day07_Operators;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2005;
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");

        } else {
            System.out.println(year + " not a leap year");
        }
    }
}

