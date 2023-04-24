package day52_MAp_FunctionalInterface;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0)
                System.out.println(n + " is even");
            else System.out.println(n + " is odd");
        };

        oddOrEvenNumber.apply(20);
      //  Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your age");
        //int age=sc.nextInt();
        MyFirstFunctionalInterface isEligible=(age)->{
            if(age>=18)
                System.out.println("Eligible");
            else System.out.println("Not eligible");
        };

        isEligible.apply(20);

        MyFirstFunctionalInterface cube= n -> {
            System.out.println(n*n*n);
        };

        cube.apply(5);

        MyFirstFunctionalInterface isDivisibleBy3And5= n -> {
            if(n%15==0)
                System.out.println("Divisible by 3 and 5");
            else System.out.println("Not divisible");
        };
        isDivisibleBy3And5.apply(45);

    }
}