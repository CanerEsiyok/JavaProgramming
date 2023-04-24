package day36_Inheritance.ScrumTeam;

public class Employee extends Person {
    public int id, salary;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, int id, int salary, String jobTitle) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
