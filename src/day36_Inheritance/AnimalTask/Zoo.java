package day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("Max","Husky","White","Small",4,'M');
        System.out.println(dog);
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.move();
        Cat cat=new Cat();
        cat.setInfo("Leyla","Scottish","Grey","Medium",9,'F');
        System.out.println(cat);
        cat.sleep();
        cat.move();
        cat.drink();
        cat.scratch();

        Tiger tiger=new Tiger();
        tiger.setInfo("Diego","Bengal","Red","Large",7,'M');
        System.out.println(tiger);
        tiger.sleep();
        tiger.move();
        tiger.eat();
        tiger.roar();

    }
}
