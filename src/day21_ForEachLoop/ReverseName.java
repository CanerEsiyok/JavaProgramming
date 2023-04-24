package day21_ForEachLoop;

public class ReverseName {
    public static void main(String[] args) {
        String name[]={"Caner Esiyok","Mustafa Esiyok","Emine Esiyok","Ece Esiyok","Fatma Esiyok","Melissa Esiyok"};

        for (String s : name) {
            String reverse="";
            for(int i=s.length()-1;i>=0;i--)
                reverse+=""+s.charAt(i);

            System.out.print(reverse+", ");
        }
    }
}
