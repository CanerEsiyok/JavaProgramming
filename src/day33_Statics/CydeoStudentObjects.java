package day33_Statics;

public class CydeoStudentObjects {
    public static void main(String[] args) {
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgrammingLanguage();
        CydeoStudent student1=new CydeoStudent("Caner",31,14,29,10,'M','A');
        System.out.println(student1);
    }
}
