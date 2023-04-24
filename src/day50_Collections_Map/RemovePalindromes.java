package day50_Collections_Map;

import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>(Arrays.asList("Java","Python","Cydeo","Car","Level","civic","radar","kayak","reviver","racecar","madam"));
        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            String result="";
            String each=it.next();
            for(int i=each.length()-1;i>=0;i--){
                result+=each.charAt(i);
            }
            if(each.equalsIgnoreCase(result))
                it.remove();
        }
        System.out.println(names);

        System.out.println("---------------------------------");
     /*   List<String>names2=new ArrayList<>(Arrays.asList("Java","Python","Cydeo","Car","Level","civic","radar","kayak","reviver","racecar","madam"));
        Predicate<String> palindrome=str->{

            String result="";
            for(int i=str.length()-1;i>=0;i--){
                result+=str.charAt(i);
            }
            return result.equalsIgnoreCase(str);
        };
        */
    }

    public static boolean isPalindrome(String word){
        String result="";
        for(int i=word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
        if(result.equalsIgnoreCase(word))
            return true;
        else return false;
    }
}
