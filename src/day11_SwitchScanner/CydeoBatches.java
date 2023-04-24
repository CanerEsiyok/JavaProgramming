package day11_SwitchScanner;

import java.util.Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type the batch you are in:");
        String batch= sc.nextLine();
        System.out.println(batch);
        String result;
        if (batch=="US morning"||batch=="US eve"||batch=="EU"){
            if (batch=="US morning")
                result="Class times are 10-5 EST. M, T, Th, F.";
            else if (batch=="US eve")
                result="Class times are 7-10 EST. M, T, W, Th, S, S";
            else result="Class times are  10-5 EST. M, T, W, Th, F.";
        } else result="Invalid Batch";
        System.out.println(result);

    }
}
