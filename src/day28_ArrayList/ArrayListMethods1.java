package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);//auto boxing
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);

        num.add(2,25);
        num.add(5,45);


        System.out.println(num);

        System.out.println(num.size());

        int n=num.get(3);
        System.out.println(n);

        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }
            System.out.println("***********************");

            ArrayList<String> list=new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("Java");
            list.add("C#");
            list.add("Ruby");

            list.set(2,"JavaScript");
            System.out.println(list);

            list.set(3,"C++");
        System.out.println(list);

        }
    }

