package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String name="Caner";
        String surname="Esiyok";
        int age=31;
        double salary=100000;
        String jobTitle="SDET";
        String companyName="Google";
        System.out.println(name +" "+surname);
        System.out.println("Full name of the person is "+name+" "+surname);
        System.out.println(name +" "+surname+" is "+age+" years old.");
        System.out.println(name+" "+surname+" is "+jobTitle+" and "+"works at "+companyName+", his salary is €"+salary);
    }
}
