package day11_SwitchScanner;
import java.util.*;

public class CharVariable2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char value");
        char ch=sc.next().charAt(0);
        String result;
        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="failed";
                break;
            default:
                result="Invalid char";


        }
        System.out.println("result = " + result);
    }
}
