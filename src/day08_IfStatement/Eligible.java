package day08_IfStatement;

public class Eligible {
    public static void main(String[] args) {
        int age1 = 17;
        byte age=(byte)age1;
        if (age >= 18) {
            System.out.println("Eligible to buy cigarettes");
        } else {
            System.out.println("NOT eligible");
        }
    }
}
