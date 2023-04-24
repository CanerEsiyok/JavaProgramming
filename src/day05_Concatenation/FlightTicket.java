package day05_Concatenation;
import java.util.*;
public class FlightTicket {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        System.out.println("Enter the departure point");
        String from= f.next();
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the arrival point");
        String to= t.next();
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the price");
        double price= p.nextDouble();
        System.out.println("From "+from+" to "+to+" is $"+price);
    }
}
