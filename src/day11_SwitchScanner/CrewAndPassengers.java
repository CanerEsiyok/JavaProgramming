package day11_SwitchScanner;
import java.util.*;

public class CrewAndPassengers {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        String result;
        if(n==50||n==75||n==100){
            if (n==50)
                result="20 crew, 30 passengers";
            else if (n==75) {
                result="25 crew, 50 passengers";

            }else result="30 crew, 70 passengers";

        } else result="Invalid number";
        System.out.println("result = " + result);
    }
}
