package day11_SwitchScanner;
import java.util.*;

public class CharVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char value");
        char ch=sc.next().charAt(0);
        String result;
        switch (ch){
            case 'A':
                result="Excellent";
                break;
            case 'B':
                result="Great";
                break;
            case 'C':
                result="Good";
                break;
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
