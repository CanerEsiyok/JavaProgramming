package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int num1 = 50,
                num2 = 100,
                num3 = 15;
        if ((num1 < num2 && num2 < num3) || (num1 > num2 && num2 > num3)) {
            System.out.println(num2 + " is the median1");

        }
        if ((num2 > num1 && num1 > num3) || (num2 < num1 && num1 < num3)) {
            System.out.println(num1 + " is the median number2");
        }
        if ((num1 > num3 && num3 > num2) || (num1 < num3 && num3 < num2)) {
            System.out.println(num3 + " is the median3");
        }
    }
}
