package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        String word="Cydeo";
        char thirdChar=word.charAt(2);
        System.out.println(thirdChar);
        int len=word.length();
        System.out.println("len = " + len);
        System.out.println("-----------------------------------");
        String s1="Batch 25 is the best batch. Java programming language";
        int kac=s1.length();
        System.out.println("kac = " + kac);
        char last=s1.charAt(s1.length()-1);
        System.out.println("last = " + last);
        System.out.println("-------------------------------");

        String str="Wooden Spoon";
        str=str.toUpperCase();
        System.out.println("str = " + str);

        String s="JAVA";
        s=s.toLowerCase();
        System.out.println("s = " + s);
    }
}
