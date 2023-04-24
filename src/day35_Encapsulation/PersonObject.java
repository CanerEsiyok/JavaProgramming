package day35_Encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person.printPlanetName();
        System.out.println(Person.isHuman);
        Person person1=new Person("Caner","French",31,'M');
        System.out.println(person1);
        person1.eat("Lahmacun");
    }
}
