package day08_IfStatement;

public class SchoolType {
    public static void main(String[] args) {
        byte grade=17;
        if(grade<=5&&grade!=0){
            System.out.println("Elementary School");
        } else if (grade>=6&&grade<=8) {
            System.out.println("Middle School");
        } else if (grade>=9&&grade<=12) {
            System.out.println("High School");
            
        } else if (grade>=13&&grade<=16) {
            System.out.println("College");
            
        } else if (grade>=17&&grade<=18) {
            System.out.println("Grade School");
            
        }else{
            System.out.println("Invalid");
        }

    }
}
