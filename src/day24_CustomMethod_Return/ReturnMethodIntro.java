package day24_CustomMethod_Return;

public class ReturnMethodIntro {
        public static String reverse(String str){
            String reverse="";
            for (int i=str.length()-1;i>=0;i--){
                reverse+=str.charAt(i);
            }
            return reverse;
          //  System.out.println(reverse);
        }

    public static void main(String[] args) {
        String str="Java";
        String result=reverse(str);
        System.out.println(result);
        if(result.equalsIgnoreCase(str))
            System.out.println("Palindrome");
        else
            System.out.println("not a palindromeret");

    }
}
