package day20_Arrays;

import java.util.Scanner;

public class AverageNumberArrays {
    public static void main(String[] args) {
        int list[]={10,20,30,40,50,60};
        int sum=0;
        for (int i = 0; i < list.length; i++) {
            sum+=list[i];
        }
        double avr=sum/list.length;
        System.out.println(avr);

    }
}
