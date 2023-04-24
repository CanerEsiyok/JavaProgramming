package day39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer=new Developer("Caner",31,'M',1453,"Developer",120000);
        Tester tester=new Tester("Ece",23,'F',1183,"QA",135000);
        Teacher teacher=new Teacher("Fatma",35,'F',14,"Turkish Teacher",140000);
        Student student=new Student("Goda",22,'F',25,"Economics");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(teacher);
        System.out.println(student);

        developer.setAge(32);
        System.out.println(developer.getAge());
        developer.work();
        teacher.work();
        tester.work();

    }
}
