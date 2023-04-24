package day08_IfStatement;

import java.time.LocalDateTime;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 5;
        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = !has30Days && !has28Days;
        if (has28Days) {
            System.out.println("28 Days");
        }
        if (has30Days) {
            System.out.println("30 Days");
        }
        if (has31Days) {
            System.out.println("31 Days");
        }
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        int hour,
                minute,
                second;
        hour=LocalDateTime.now().getHour();
        minute=LocalDateTime.now().getMinute();
        second=LocalDateTime.now().getSecond();
        System.out.println(hour+":"+minute+":"+second);
    }
}
