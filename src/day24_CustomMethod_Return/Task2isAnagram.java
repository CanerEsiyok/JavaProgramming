package day24_CustomMethod_Return;

import java.util.Arrays;
import java.util.Scanner;

public class Task2isAnagram {
    public static boolean isAnagram(String str1,String str2){
        char[] arr1 =str1.toCharArray();
        char[] arr2= str2.toCharArray();
       // System.out.println(Arrays.toString(arr1));
       // System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String 1:");
        String str1= sc.next();
        System.out.println("String 2:");
        String str2= sc.next();
        System.out.println(isAnagram(str1,str2));

    }
}
