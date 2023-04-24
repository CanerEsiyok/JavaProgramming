package day14_String;

public class StringMethods3 {
    public static void main(String[] args) {
        String word="Cydeo School";
        String brand=word.substring(0,5);
        System.out.println(brand);
        String word1=word.substring(6);
        System.out.println(word1);
        String word2="Java Programming Language";
        int n1=word2.indexOf("a ");
        String s1=word2.substring(0,n1+1);
        System.out.println(s1);
       // int n2=word2.indexOf("P");
       // int n22=word2.indexOf("g ");
       // String s2=word2.substring(n2,n22+1);
        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
       // int n3=word2.indexOf("L");
      //  int n33=word2.lastIndexOf("e");
        String s3=word2.substring(word2.indexOf("L"));
        System.out.println(s2);
        System.out.println(s3);



    }
}
