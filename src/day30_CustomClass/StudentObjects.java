package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Caner",'M',31,1183,'A');
        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();

        student2.setInfo("Ece",'F',23,1405,'B');
        student3.setInfo("Fatma",'F',35,1453,'A');
        student4.setInfo("Emine",'F',58,1964,'B');
        Student student5=new Student();
        student5.setInfo("Mustafa",'M',61,7195,'C');

        Student[] students={student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------------");

        ArrayList<Student> earlyBirds=new ArrayList<>(Arrays.asList(students)); //grade A
        ArrayList<Student> angryBirds=new ArrayList<>(Arrays.asList(students));

        earlyBirds.removeIf(p-> p.grade!='A');
        angryBirds.removeIf(p->p.grade=='A');

        System.out.println(earlyBirds);
        System.out.println(angryBirds);






    }
}