package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        int[] intArray={5,6,0,-1,3,4};
        Arrays.sort(intArray);
        double[] doubleArray={10.5,11.5,5.5,4.5};
        Arrays.sort(doubleArray);
        char[] charArray={'E','F','B','D','C','A'};
        Arrays.sort(charArray);
        int a=5;
        int b=7;
        int c=18;
        int d=9;
        System.out.println(sum(a,b));
        System.out.println(sum(c,d));
        System.out.println(sum(5,7.5,12.3));


    }
    public static double sum(double a,double b,double c){
        return sum(a,b)+c;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
