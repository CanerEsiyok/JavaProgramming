package review;

class Employee{
    public int salary;
}
class Manager extends Employee{
    public int budget;
}
class Director extends Manager{
    public int stockOptions;
}
public class Test{
    public static void main(String[] args) {
        Employee employee=new Employee();
        Manager manager=new Manager();
        Director director=new Director();


    }
}