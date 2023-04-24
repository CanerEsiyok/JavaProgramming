package review;

public class CustomMethods {
    public static void displayMethod(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        displayMethod();
        displayValue(5);
        oddOrEven(9);
        int a=sum(5,7)*2;
        System.out.println(a);
        System.out.println(reverse("renac"));
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("anne"));
    }

    public static void displayValue(int n){
        System.out.println("the value is: "+n);
    }

    public static void oddOrEven(int n){
        if(n%2==0)
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static String reverse(String str){
        String result="";
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i)+"";
        }
        return result;
    }

    public static boolean isPalindrome(String str){
        String reversed=reverse(str);
        if(reversed.equals(str))
            return true;
        else
            return false;
    }

}

