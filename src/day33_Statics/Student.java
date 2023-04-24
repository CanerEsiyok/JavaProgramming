package day33_Statics;

public class Student {
    public String name;
    public char gender,grade;
    public int age,studentID;

    public Student(String name){
        this.name=name;
    }
    public Student(String name,char gender){
        this(name);
        this.gender=gender;
    }
    public Student(String name,int studentID){
        this(name);
        this.studentID=studentID;
    }
    public Student(String name,int studentID,char grade){
        this(name, studentID);
        this.gender=gender;
    }
    public Student(String name,char gender,int age){
        this(name, gender);
        this.age=age;
    }
    public Student(String name,char gender,int age,int studentID){
        this(name, gender, age);
        this.studentID=studentID;
    }
    public Student(String name,char gender,int age,int studentID,char grade){
        this(name, gender, age, studentID);
        this.gender=gender;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
}
