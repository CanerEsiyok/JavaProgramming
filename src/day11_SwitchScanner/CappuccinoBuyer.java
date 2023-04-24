package day11_SwitchScanner;

import java.util.Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        String size=sc.nextLine();
        String result="";
            switch (size){
                case "tall":
                    result="price is $3.69\n90 calories";
                    break;
                case "grande":
                    result= "price is $3.99;\n" +
                            "120 calories";
                    break;
                case "venti":
                    result="price is $4.29\n" +
                            "150 calories";
                    break;
                default:
                    result="Invalid size";
                    break;

            }


        System.out.println(result);
} }
