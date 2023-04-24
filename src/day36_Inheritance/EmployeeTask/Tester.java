package day36_Inheritance.EmployeeTask;

public class Tester extends Employee{
    public String date;

    public void setInfo(String name, String jobTitle, char gender, int age, long id, double salary,String date) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.date=date;}

    public void testing(){
        System.out.println(name+" is testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating a ticket");
    }

    public String toString() {
        return "Tester{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
