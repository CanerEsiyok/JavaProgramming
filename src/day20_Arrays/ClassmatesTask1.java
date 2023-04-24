package day20_Arrays;

public class ClassmatesTask1 {
    public static void main(String[] args) {
        String names[]={"Caner Esiyok","Ece Esiyok","Emine Esiyok","Mustafa Esiyok","Fatma Esiyok"};
        String init="";
        for (int i = 0; i < names.length; i++) {
            String a=names[i].substring(0,1)+names[i].substring(names[i].indexOf(" ")+1,names[i].indexOf(" ")+2);
            System.out.println(a);
        }
    }
}
