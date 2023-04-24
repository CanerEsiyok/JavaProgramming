package day33_Statics;

public class CydeoStudent {
        public String name;
        public int age,id,batchNumber,groupNumber;
        public char gender,grade;
        public static String schoolName="Cydeo";
        public static String programmingLanguage="Java";

    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }
    public void study(){
        System.out.println(name+" is studying");
    }
    public void attendClass(){
        System.out.println(name+" is attending the class");
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printProgrammingLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
