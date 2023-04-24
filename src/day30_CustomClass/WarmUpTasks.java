package day30_CustomClass;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        System.out.println("---------------------------------");

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int size=list.size();
        list.removeIf(p->p==0);
        int n=size- list.size();
        for (int i = 0; i < n; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("---------------------------------");

        String str="ABCD123$%#@&456EFG!";
        char[] ch=str.toCharArray();
        ArrayList<Character>list2=new ArrayList<>();
        for (char c : ch) {
            list2.add(c);
        }
        ArrayList<Character> letters=new ArrayList<>(list2);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits=new ArrayList<>(list2);
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> specialChars=new ArrayList<>(list2);
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
       // specialChars.removeIf(p->Character.isLetterOrDigit(p));
        System.out.println(specialChars);
    }
}
