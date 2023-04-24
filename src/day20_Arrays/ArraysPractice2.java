package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char letters[]=new char[26];
        char ch='A';
        for (int i = 0; i <26 ; i++) {
            letters[i]=ch;
            ch++;
        }
        for (char i='A',j=0;i<='Z'&&j<26;i++,j++){
            letters[j]=i;
        }
        System.out.println(Arrays.toString(letters));
    }
}
