package day53_FunctionalInterface.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Predicate;

public class Task3Predicate {
    /*3. Use Predicate Functional interface to:
		3.1 Create a function that can verify if a strong contains duplicated characters

		3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
		        1 Password must be at least have 8 characters long, and should not contain space
		        2 PassWord should at least contain one upper case letter
		        3 PassWord should at least contain one lower case letter
		        4 Password should at least contain one special characters
		        5 Password should at least contain a digit
*/
    public static void main(String[] args) {
        Predicate<String> duplicatedCharacters=s->{
            int before=s.length();
            String[] arr = s.split("");
            HashSet<String> set = new HashSet<>(Arrays.asList(arr));
            int after=set.size();
            return (before== after)?false:true;
        };
        System.out.println(duplicatedCharacters.test("kalem"));

        Predicate<String> isStrong=s->{
            boolean r1=true;
            if(s.length()<8 || s.contains(" "))
                r1=false;
            boolean r2=false;
            boolean r3=false;
            boolean r4=false;
            boolean r5=false;

            for (int i = 0; i < s.length(); i++) {
                    if(Character.isUpperCase(s.charAt(i)))
                        r2=true;
                    if(Character.isLowerCase(s.charAt(i)))
                        r3=true;
                    if(Character.isDigit(s.charAt(i)))
                        r4=true;
                    if(!Character.isLetterOrDigit(s.charAt(i)))
                        r5=true;
                }
            return r1==r2==r3==r4==r5;
        };
        System.out.println(isStrong.test("LAVIGaNE4."));
    }
}
