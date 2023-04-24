package day37_Inheritance.phoneTask;



public class Objects {
    public static void main(String[] args) {
        IPhone phone1= new IPhone("13","6.1","Blue",769);
        Samsung phone2=new Samsung("galaxy","6 inches","Black",900);
        System.out.println(phone1);
        System.out.println(phone2);
        phone1.call(91456641);
        phone1.faceTime(1686534);
        phone2.call(882264565);
        phone2.freeze();

    }
}
