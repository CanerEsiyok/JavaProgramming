package day36_Inheritance.EmployeeTask;

public class Employee {
    public String name,jobTitle;
    public char gender;
    public int age;
    public long id;
    public double salary;

    public void setInfo(String name, String jobTitle, char gender, int age, long id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
