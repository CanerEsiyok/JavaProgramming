package utilities;

import java.util.Arrays;

public class StringUtility {
    // prints each character
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    //reverses a string
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
    //returns true if it is a palindrome
    public static boolean isPalindrome(String str){
        if(reverse(str).equalsIgnoreCase(str))
            return true;
        else
            return false;
    }
    // checks if two strings are anagram
    public static boolean isAnagram(String str1,String str2){
        char[] arr1=str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
            return true;
        else
            return false;
    }
    //removes the duplicates from given string and returns a string
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.toLowerCase().charAt(i)+""))
                result+=str.charAt(i);
        }
        return result;
    }


}
