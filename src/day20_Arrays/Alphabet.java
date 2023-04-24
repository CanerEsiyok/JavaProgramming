package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char ch[]=new char[26];
        char a='Z';
        for (int i = 0; i <26 ; i++) {
            ch[i]=a;
            a--;
        }
        System.out.println(Arrays.toString(ch));

    }
}
