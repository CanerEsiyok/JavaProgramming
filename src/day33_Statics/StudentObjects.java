package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Mert");
        System.out.println(student1);
        Student student2=new Student("Aygun",'M');
        Student student3=new Student("Nigara",11);
        Student student4=new Student("Aylin",12,'F');
        Student student5=new Student("Mary",'F',28);
        Student student6=new Student("Ece",'F',23,14);
        Student student7=new Student("Emine",'F',58,41,'A');

        System.out.println(student2);
        Student[] students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));

    }
}
