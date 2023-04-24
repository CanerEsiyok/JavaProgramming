package day53_FunctionalInterface.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Task2 {
  /*  *2.1 Create a function that can return the maximum number from an array of Integers

		1.2 Create a function that can return the minimum number from an array of Integers

		1.3 Create a function that can return the longest String from an array of String

		1.4 Create a function that can return the shortest String from an array of String
*/
  public static void main(String[] args) {

    Function<Integer[], Integer> maxNumber=n->{
      ArrayList<Integer> list = new ArrayList<>();
      for (Integer i : n) {
        list.add(i);
      }
      return Collections.max(list);
    };
    Integer[] arr={1,2,3,4,5,6,7,8,9};
    System.out.println(maxNumber.apply(arr));

    Function<String[],String> shortestString=n->{
      String shortest="";
      int min=Integer.MAX_VALUE;
      for (String s : n) {
        if(s.length()<min){
          min=s.length();
          shortest=s;
        }
      }
      return shortest;
    };
    String[] names={"Caner","Emine","Mustafa","Fatma","Ece"};
    System.out.println(shortestString.apply(names));


  }
}

