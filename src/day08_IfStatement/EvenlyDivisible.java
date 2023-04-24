package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int num=65;
        boolean div2=num%2==0;
        boolean div3=num%3==0;
        boolean div5=num%5==0;
        System.out.println(num+" is divisible by 2: "+div2);
        System.out.println(num+" is divisible by 3: "+div3);
        System.out.println(num+" is divisible by 5: "+div5);
    }
}
