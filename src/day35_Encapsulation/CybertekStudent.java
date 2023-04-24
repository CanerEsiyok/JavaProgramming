package day35_Encapsulation;

public class CybertekStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber,groupNumber;
    public static String schoolName,programmingLanguage;
    public String fieldOfStudy;

    public CybertekStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="Cydeo School";
        programmingLanguage="Java";
    }

    public static void printSchoolName(){
        System.out.println("School name is "+schoolName);
    }
    public void attendClass(){
        System.out.println(name+" is attending the class");
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
