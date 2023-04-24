package day41_Exceptions;

import day39_Recap.CydeoTask.Cydeo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");

        try {
            System.out.println(9/0);
            System.out.println("Test Block");
        }catch (ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("Arithmetic exception occurred");
        }

        System.out.println("Test completed");

        System.out.println("----------------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers={1,2,3,4,5};

        try {
            System.out.println(numbers[200]);
            System.out.println("Test block");
        }catch (RuntimeException e){
            System.out.println(numbers.length);
            System.out.println("Catch block");
           // e.printStackTrace();
          //  System.err.println(e.getMessage());
        }


        System.out.println("Test complete");

        System.out.println("------------------------------------------");

        System.out.println("Test 3 Created");

        try {
            System.out.println("Cydeo".substring(2,0));
            System.out.println("Test block");
        }catch (RuntimeException e){
            System.out.println("Cydeo".substring(0,2));
            System.out.println("Catch block");
         //  e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Test 3 complete");

        System.out.println("----------------------------------");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test4");
    }
    FileInputStream file;

    {
        try {
            file = new FileInputStream("file path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

