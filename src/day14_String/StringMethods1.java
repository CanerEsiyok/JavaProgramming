package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str="    batch 25         ";
        str=str.trim();
        System.out.println(str);

        String str1="Cydeo School";
        int n1=str1.indexOf("h");
        System.out.println(n1);
        int n2=str1.indexOf("oo");
        System.out.println(n2);
        String st2="Java Programming Language";
        int n3=st2.indexOf("gua");
        System.out.println(n3);
        int n4=st2.lastIndexOf("g");
        System.out.println(n4);
        System.out.println("-------------------------");

    }
}
