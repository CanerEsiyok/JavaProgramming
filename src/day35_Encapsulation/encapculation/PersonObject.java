package day35_Encapsulation.encapculation;

public class PersonObject {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Daniel");
        person1.setAge(20);
        System.out.println(person1.getName()+" : "+person1.getAge());
        System.out.println(person1);
    }
}
