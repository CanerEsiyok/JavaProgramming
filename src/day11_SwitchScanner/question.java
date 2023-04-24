package day11_SwitchScanner;
import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Type the batch you are in:");
        String batch= sc.nextLine();

        //System.out.println(batch);

        String result;

        if (batch.equals("US morning")||batch.equals("US eve")||batch.equals("EU")){
            if (batch=="US morning")
                result="Class times are 10-5 EST. M, T, Th, F.";
            else if (batch=="US eve")
                result="Class times are 7-10 EST. M, T, W, Th, S, S";
            else result="Class times are  10-5 EST. M, T, W, Th, F.";
        } else {result="Invalid Batch";}
        System.out.println(result);

    }
}
