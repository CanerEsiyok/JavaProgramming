package day06_PrimitiveTypeCastings;

public class Birthday {
    public static void main(String[] args) {
        String name = "Caner Esiyok",
                birthMonth = "May";
        int birthDay = 31,
                birthYear = 1991;

        System.out.println(name + " was born on " + birthDay + "\\" + birthMonth + "\\" + birthYear);
        String book = "1984";
        System.out.println("My favourite book is \"" + book + "\".");
        double dl = 300;
        int a = (int) dl;
        System.out.println(dl+" : "+a);

        float fl=30.5F;
        long l1= (long) fl;
        System.out.println(fl+" ; "+l1);

    }
}
