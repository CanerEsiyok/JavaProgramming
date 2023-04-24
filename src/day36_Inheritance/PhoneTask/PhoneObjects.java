package day36_Inheritance.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        IPhone phone1=new IPhone();
        phone1.setInfo("Iphone","13","6.1inc","Blue",779);
        phone1.faceTime(077);
        Nokia phone2=new Nokia();
        phone2.model="5110";
        phone2.selfDefense();
        System.out.println(phone1);
    }
}
