package day15_ForLoops;

public class StringMethods {
    public static void main(String[] args) {
        String str="                      ";
        boolean r=str.isEmpty();
        System.out.println(r);
        boolean d=str.isBlank();
        System.out.println(d);
        System.out.println("*******************************");

        String word="cydeo";
        String word1="CYdeO";
        System.out.println(word.equals(word1));
        System.out.println(word.equalsIgnoreCase(word1));
        System.out.println("***************************");
        String s="My favourite programming language is Java";
        boolean hasC=s.contains("C#");
        System.out.println("hasC = " + hasC);;
        boolean hasJava=s.contains("Java");
        System.out.println("hasJava = " + hasJava);
        boolean hasjava=s.contains("java");
        boolean s1=s.toLowerCase().contains("java");
        System.out.println("hasjava = " + hasjava);
        System.out.println("s1 = " + s1);

        System.out.println("************************");
        String a="Wooden Spoon";
        System.out.println(a.startsWith("Woo"));
        System.out.println(a.endsWith("oon"));
        System.out.println(a.toLowerCase().startsWith("wood"));
    }
}
