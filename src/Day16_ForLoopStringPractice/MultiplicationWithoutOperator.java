package Day16_ForLoopStringPractice;

import java.util.Scanner;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First number:");
        int n1= sc.nextInt();
        System.out.println("Second number:");
        int n2= sc.nextInt();
        int result=0;

        for (int i = 0; i < n1; i++) {
            result+=n2;

        }
        System.out.println(result);
    }
}
