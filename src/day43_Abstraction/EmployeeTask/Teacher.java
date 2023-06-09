package day43_Abstraction.EmployeeTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("is working");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 7 hours");
    }
}
