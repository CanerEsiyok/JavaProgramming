package day53_FunctionalInterface.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskStream {

    public static void main(String[] args) {
        //1. Write a program that can remove the duplicated elements of an array of String
        String[] str = {"java", "java", "aa", "bb", "java", "python"};
        System.out.println(Arrays.toString(Arrays.stream(str).distinct().toArray()));
        //2. Write a program that can remove the duplicated elements of a List of String
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Caner", "Ece", "Ece", "Emine", "Ece"));
        System.out.println("names.stream().distinct().collect(Collectors.toList()) = " + names.stream().distinct().collect(Collectors.toList()));

        /*3. Write a program that can count how many "java" and "python" does the array has:
			ex: array = {"Java", "jAVa", "pythON"}

			output:
				countJava = 2
				countPython = 1*/

        String[] arr = {"Java", "jAVa", "pythON"};
        long javaCount = Arrays.stream(arr).filter(s -> s.equalsIgnoreCase("java")).count();
        long pythonCount = Arrays.stream(arr).filter(s -> s.equalsIgnoreCase("python")).count();
        System.out.println("javaCount = " + javaCount);
        System.out.println("pythonCount = " + pythonCount);
        /*4.4 Write a program that can count how many Positive numbers does the List has
		ex: List = {1,2,3,4,-4,5,-5}

		output:
			5*/
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5));
        System.out.println("list.stream().filter(p->p>0).count() = " + list.stream().filter(p -> p > 0).count());
        /*4. Wirte a program that can return all the positive numbers of List without the duplcaites
		ex:
			list = {1,2,3,4,-4,5,-5,1,2,3,4}

		output:
			{1,2,3,4,5}*/
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5, 1, 2, 3, 4));
        list2 = list2.stream().distinct().filter(p -> p > 0).collect(Collectors.toList());
        System.out.println("list2 = " + list2);

        /*5. Wirte a program that can return the palindrome Strings from a list:
		Ex:
			list = {"Java", "level", "Anna", "Wooden Spoon"};

		output:
			{"level", "Anna"}*/

        List<String> words = new ArrayList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon"));
        System.out.println("words.stream().filter(p->(new StringBuilder(p).reverse().toString().equalsIgnoreCase(p))).collect(Collectors.toList()) = " + words.stream().filter(p ->
                new StringBuilder(p).reverse().toString().equalsIgnoreCase(p)).collect(Collectors.toList()));
        /*6. Write a program that can returun the unique elements of an array as a new array:

		Ex: arr = {1,1,2,3,3,4,5,5,6};

		output:
			{2,4,6}*/
        int[] a = {1, 1, 2, 3, 3, 4, 5, 5, 6};
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6));
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : integers) {
            if (Collections.frequency(integers, i) == 1)
                result.add(i);
        }
        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i] = result.get(i);
        }
        System.out.println("ints = " + Arrays.toString(ints));
        int[] uniques = Arrays.stream(a).filter(p -> Arrays.stream(a).filter(i -> i == p).count() == 1).toArray();


        String s = "125";
        int i = Integer.parseInt(s);
        System.out.println(i + 2);
        String str1 = "2.5";
        //  double v = Double.parseDouble(str1);
        double v = Double.valueOf(str1);
        System.out.println(v + 2);
        int n = 5;
        String s1 = String.valueOf(n);
        
    }
}