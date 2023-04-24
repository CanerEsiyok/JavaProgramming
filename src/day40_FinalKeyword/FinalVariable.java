package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    final static String name;

    static {
        name="Programming";
    }
    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        final double pi=3.14;

        final String name;
        name="Java";

        FinalVariable obj=new FinalVariable("May/31");
        System.out.println(obj.birthday);
        System.out.println(FinalVariable.name);




    }
}
