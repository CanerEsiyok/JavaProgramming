package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.println("*****************");

        System.out.println(StringUtility.reverse(str));
        System.out.println("**************");
        String word="Budapest";
        System.out.println(StringUtility.isPalindrome(word));
        String[] names={"Anna","Java","Python","racecar","Mom", "Cydeo"};
        int count=0;
        for (String name : names) {
            if(StringUtility.isPalindrome(name))
                count++;
        }
        System.out.println(count);

        String str1="acb";
        String str2="bca";
        System.out.println("Anagram= "+StringUtility.isAnagram(str1,str2));
        System.out.println("****************");
        String dup="aaaaaabbbccccdddeff";
        System.out.println(StringUtility.removeDuplicates(dup));
    }

}
