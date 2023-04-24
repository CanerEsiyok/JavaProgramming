package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int num1=100;
        int num2=200;
        boolean min=num1<num2;
        boolean min1=num2<num1;
        boolean equ=num1==num2;
        if(min==true){
            System.out.println("MinNumber is "+num1);
        }
        if(min1==true){
            System.out.println("MinNumber is "+num2);
        }
        if(equ==true){
            System.out.println("Numbers are equal");
        }



    }
}
