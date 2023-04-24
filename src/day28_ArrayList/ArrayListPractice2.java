package day28_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);list.add(200);list.add(200);list.add(200);list.add(300);list.add(400);list.add(500);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        Integer num=300;
        list.remove(num);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("--------------------------------");

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a=characters.indexOf('A');
        int b=characters.lastIndexOf('A');
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean r=characters.contains('A');
        boolean r2=characters.contains('z');
        System.out.println("r = " + r);
        System.out.println("r2 = " + r2);

        System.out.println("--------------------------------");

        ArrayList<Integer> num1=new ArrayList<>();
        num1.add(100);
        num1.add(200);
        num1.add(300);
        ArrayList<Integer> num2=new ArrayList<>();
        num2.add(100);
        num2.add(200);
        num2.add(300);

        boolean r3= num1.equals(num2);
        System.out.println("r3 = " + r3);

        System.out.println("--------------------------------");

        boolean r4=num1.isEmpty(); //false
        System.out.println("r4 = " + r4);
        num1.clear();
        boolean r5=num1.isEmpty();
        System.out.println("r5 = " + r5);

        System.out.println("--------------------------------");
// Bulk Operation
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);




    }
}
