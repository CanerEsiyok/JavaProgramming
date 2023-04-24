package day05_Concatenation;
import java.util.*;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the country code");
        int countryCode= a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.println("Enter the area code");
        int areaCode= b.nextInt();
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the Local Number");
        int localNumber=c.nextInt();
        System.out.println("+"+countryCode+"("+areaCode+")-"+localNumber);
    }
}
