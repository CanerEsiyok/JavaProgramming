package day43_Abstraction.EmployeeTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours a day");

    }

    public final void unitTesting(){
        System.out.println(getName()+" is unit testing");
    }
}
