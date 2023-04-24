package day22_MultiDimedsilonalArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sen="Today is a great day";
        String[] a=sen.split(" ");
        String[] reverse=new String[a.length];
        int j=a.length-1;
        for (int i = 0; i <a.length ; i++) {
            reverse[i]=a[j--];
        }
        String fin="";
        for (String s : reverse) {
            fin+=s+" ";
        }
        System.out.println(fin);



    }
}
