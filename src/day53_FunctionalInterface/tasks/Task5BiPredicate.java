package day53_FunctionalInterface.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.BiPredicate;

public class Task5BiPredicate {
    /*



		5.3 Create a function that can check if two List of Integers are equal and contains the same elemnts
				ex: list1 = {3,2,1}
					list2 = {2,1,3}

				output: true

		5.4 Create a function that can check if the first List contains all the elemnts of the second List:
				ex: list1 = {1,2,3,4,5,6}
					list2 = {7,8}

				output: false

*/
    public static void main(String[] args) {
        /*5.1 Create a function that can check if two array are equal and contains the same elemnts
				ex: arr1 = {3,2,1}
					arr2 = {2,1,3}

				output: true*/

        BiPredicate<int[],int[]> isEqual=(a,b)->{
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a,b);
        };
        int[]arr1 = {3,2,1};
        int[] arr2 = {2,1,3};
        System.out.println(isEqual.test(arr1, arr2));
/*5.2 Create a function that can check if the first array contains all the elemnts of the second array:
				ex: arr1 = {1,2,3,4,5,6}
					arr2 = {7,8}

				output: false*/
        BiPredicate<int[],int[]>containsAll=(a,b)->{
            ArrayList<Integer> alist = new ArrayList<>();
            ArrayList<Integer> blist = new ArrayList<>();
            for (int i : a) alist.add(i);
            for (int i : b) blist.add(i);
            System.out.println("alist = " + alist);
            System.out.println("blist = " + blist);
            System.out.println("alist.equals(blist) = " + alist.equals(blist));
            return alist.containsAll(blist);
        };
        int[]ar1 = {1,8};
        int[] ar2 = {1,8};
        System.out.println("containsAll.test(ar1,ar2) = " + containsAll.test(ar1, ar2));

    }
}
