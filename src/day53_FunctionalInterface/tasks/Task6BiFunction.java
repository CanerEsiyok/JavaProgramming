package day53_FunctionalInterface.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Task6BiFunction {
    /*6.



		6.3 Create a function that can return the common elements of two String arrays

		6.4 Create a function that can return the common elements of two Lists of Integers

		6.5 Create a function that can return the common elements of two Lists of Strings
*/
    public static void main(String[] args) {
        /*Use BiFunction functional interface to:
		6.1 Create a fucntion that can returns the common characters of two strings
				ex: str1 = "Python"
					str2 = "Wooden Spoon"

				output: on*/
        BiFunction<String,String,String> commonChars=(a,b)->{
            String result="";
            for (int i = 0; i < a.length(); i++) {
                for (int i1 = 0; i1 < b.length(); i1++) {
                    if(a.charAt(i)==b.charAt(i1))
                        if(!result.contains(a.charAt(i)+""))
                            result+=a.charAt(i);
                }
            }
            return result;
        };
        String str1="Python";
        String str2="Wooden Spoon";
        System.out.println("commonChars.apply(str1,str2) = " + commonChars.apply(str1, str2));
//6.2 Create a function that can return the common elements of two integer arrays
        BiFunction<int[],int[],List<Integer>> commonInt=(a,b)->{
            ArrayList<Integer>alist=new ArrayList<>();
            ArrayList<Integer>result=new ArrayList<>();
            for (int i : a) {
                alist.add(i);
            }
            for (int i : b) {
                if(alist.contains(i))
                    result.add(i);

            }
            return result;
        };
        int[] a={1,2,3,4,5,6};
        int[] b={1,2,3};
        System.out.println("commonInt.apply(a,b) = " + commonInt.apply(a, b));

    }
}
