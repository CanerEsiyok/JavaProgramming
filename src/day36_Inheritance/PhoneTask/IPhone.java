package day36_Inheritance.PhoneTask;

public class IPhone extends Phone{
    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" is facetiming");
    }
    public void faceTime(String email){
        System.out.println(email+" is facetiming");
    }

}
