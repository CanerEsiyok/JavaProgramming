package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[] ch=str.toCharArray();
        for(char i:str.toCharArray()){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(ch));
        System.out.println("---------------------------------");
        String sen="Wooden Spoon";
        String[] words=sen.split(" ");
        System.out.println(Arrays.toString(words));
        String email="WoodenSpoon@cydeo.com";
        String[] a=email.split("@");
        System.out.println(Arrays.toString(a));
        String sent="Today is a nice day. Today is Tuesday. Today I study.";
        String[] b=sent.split("\\. ");
        System.out.println(Arrays.toString(b));
    }
}
