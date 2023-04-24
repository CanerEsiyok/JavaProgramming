package day20_Arrays;

public class Task4 {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        grades[0]='A';
        grades[1]='C';
        grades[2]='B';
        for (int i = 0; i < scores.length; i++) {
            System.out.println(names[i]+"'s score is "+scores[i]+" and grade is "+grades[i]);
        }
    }
}
