package day35_Encapsulation;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(3,2.5,25,true);
        System.out.println(carpet1);
        Carpet carpet2=new Carpet(4,7,14,false);
       // carpet1.setWidth(5);
        carpet1.setPersian(false);
        System.out.println(carpet1);

    }
}
