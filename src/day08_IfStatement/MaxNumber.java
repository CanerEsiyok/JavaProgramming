package day08_IfStatement;

public class MaxNumber {
    public static void main(String[] args) {
        int a=100,
                b=200;
        if(a<b){
            System.out.println(b+" is the max number");
        } else if (a>b) {
            System.out.println(a+ " is the max number");

        }else {
            System.out.println("They are equal");
        }
    }
}
