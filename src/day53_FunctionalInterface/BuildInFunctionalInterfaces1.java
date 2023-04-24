package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {
    public static void main(String[] args) {

        Predicate<String>isPalindrome= p->{
            String reverse=new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
        System.out.println(isPalindrome.test("level"));

        Predicate<Integer>isEven=p-> p%2==0;
        System.out.println(isEven.test(5));
        List<Integer> list=new ArrayList<>(Arrays.asList(1,12,3,4,5,6,7,8,9,10));
        list.removeIf(isEven);
        System.out.println(list);
        System.out.println("--------------------------------------");

        Consumer<String>printEach=p->{
            for (int i = 0; i < p.length(); i++) {
                System.out.println(p.charAt(i));
            }
        };
        printEach.accept("Koltuk");
        System.out.println("--------------------------------------");

        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));

        list2.forEach(p->{
            if(p%2!=0 )
                System.out.println(p);

        });
        System.out.println("--------------------------------------");

        Function<int[],List<Integer>>convertToList=(a)->{
            List<Integer> result  =new ArrayList<>();
            for (int i : a) {
                result.add(i);
            }
            return result;
        };

        int[] arr={1,2,3,4,5,6,7,8,9};
        List<Integer> newList=convertToList.apply(arr);
        System.out.println(newList);

        System.out.println("--------------------------------------");
        Function<List<Integer>,int[]>convertToArray=(a)->{
            int[]result= new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i]=a.get(i);
            }
            return result;
        };




    }
}
