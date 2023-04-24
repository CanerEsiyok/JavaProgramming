package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {
        String str="Cydeo";
        str=str.repeat(4);
        System.out.println(str);

        String s1="Wooden Spoon ";
        s1=s1.repeat(100);
        System.out.println(s1);

        System.out.println("Laptop\n".repeat(15));

        String word="Java";
        System.out.println((word+" ").repeat(5));
    }
}
