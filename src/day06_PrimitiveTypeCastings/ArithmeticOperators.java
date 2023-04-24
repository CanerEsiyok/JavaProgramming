package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int islem=10%3;
        System.out.println("islem = " + islem);
        System.out.println(10d/4);

        int a=100;
        double b=a/6;
        System.out.println("b = " + b);
        double c=(double)a/6;
        System.out.println("c = " + c);

    }
}