package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int index=0;
        for (Integer i : list) {
            list.set(index++,i*2);
        }
        System.out.println(list);

        System.out.println("----------------------------------------");

        ArrayList<String> employees=new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove("Neira");
        System.out.println(employees);
        boolean b1=employees.remove("aaa");
        System.out.println(employees);
        System.out.println(b1);


    }
}
