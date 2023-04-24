package day39_Recap.CydeoTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating a ticket");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing the app");
    }
}
