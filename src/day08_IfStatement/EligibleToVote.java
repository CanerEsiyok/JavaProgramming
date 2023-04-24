package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        int age=38;
        String name="Caner";
        String citizen="USA";
        if(age>=18&&citizen=="USA"){
            System.out.println(name+" is eligible to vote");
        }
        boolean isEligible=age>=18&&citizen=="USA";
        if(isEligible){
            System.out.println(name+" is eligible to vote");
        }
        if(!isEligible){
            System.out.println(name+" is not eligible to vote");
        }
    }

}
