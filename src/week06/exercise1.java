package week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        /* Ask the user to type the digits they want to enter
        create a scanner to write down the numbers
        use split method to turn the string variable into an array
        go through the elements and remove non digits ones
        add them to a list
        create a list
        go through the first and add the digit ones( not smaller than 0 not greater than 9)
        add them to a list
        sort them and print
        */
        Scanner sc= new Scanner(System.in);
        System.out.println("Write the digits you want to add: ");
        String digits= sc.next();

        String[] list = digits.split(",");
        ArrayList<Integer> result=new ArrayList<>();

       // System.out.println(Arrays.toString(list));
        for (String each : list) {
            try {
                    result.add(Integer.parseInt(each));
            }catch (Exception e){
                System.err.println(each +"is not a digit");;
            }

        }
        ArrayList<Integer> outcome=new ArrayList<>();
        for (Integer each : result) {
            if(each<9&&each>0 )
                outcome.add(each);
            else
                System.err.println(each+" is not a digit");

        }
        Collections.sort(outcome);
        for (Integer each : outcome) {
            System.out.print(each);
        }


    }
}
