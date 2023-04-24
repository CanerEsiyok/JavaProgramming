package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java.";
        str = str.replace("Java", "Python");
        System.out.println(str);

        String s = "JonasSmith@yahoo.com";
        s = s.replace("yahoo", "gmail");
        s = s.toLowerCase();
        System.out.println(s);

        String n = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        n = n.replace("Python", "");
        n = n.replace("  ", " ");
        n = n.replace("  ", " ");
        System.out.println(n);

        System.out.println("-----------------");
        String ss = "Java Java Java";
        ss = ss.replaceFirst("Java", "Python");
        System.out.println(ss);
        String j="Java";
        j=j.replace("va","vo");
        System.out.println(j);
    }
}
