package day49_Collections;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer>q1= new PriorityQueue<>();
        q1.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(q1);

        Queue<Integer>q2= new ArrayDeque<>();
        q2.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(q2);

        Queue<Integer>q3= new LinkedList<>();
        q3.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(q3);

        q1.poll();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        q2.poll();
        System.out.println(q2);
        q3.poll();
        System.out.println(q3);


        System.out.println(((LinkedList<Integer>) q3).get(1));

    }
}
