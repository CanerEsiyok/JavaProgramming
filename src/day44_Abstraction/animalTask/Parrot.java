package day44_Abstraction.animalTask;

public class Parrot extends Animal implements Playable,Fly{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with a swing");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is playing low");
    }
}
