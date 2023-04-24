package utilities;

public class MathUtility {
    //returns the sum of two integers
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    //returns the subtraction of two integers
    public static int subtract(int a,int b){
        return a-b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    //returns the multiplication of two numbers
    public static int multiplication(int a,int b){
        return a*b;
        
    }
    public static double multiplication(double a,double b){
        return a*b;

    }
    //divides two numbers
    public static double division(double a,double b){
        return a/b;
    }
    //checks if an integer is an even number
    public static boolean isEven(int n){
        boolean result=false;
        if(n%2==0)
            result=true;
        return result;
    }
    //checks if an integer is an odd number
    public static boolean isOdd(int n){
        boolean result=false;
        if(n%2==0)
            result=true;
        return result;
    }
    //returns the max number
    public static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static double max(double a,double b){
        if(a>b)
            return a;
        else
            return b;
    }
    //returns the min number
    public static int min(int a,int b){
        if(a<b)
            return a;
        else 
            return b;
    }
    public static double min(double a,double b){
        if(a<b)
            return a;
        else
            return b;
    }
    //returns the square of a number
    public static int square(int n){
        return n*n;

    }
    public static double square(double n){
        return n*n;

    }
    //returns the cube of a number
    public static int cube(int n){
        return n*n*n;
        
    }
    public static double cube(double n){
        return n*n*n;

    }

}
