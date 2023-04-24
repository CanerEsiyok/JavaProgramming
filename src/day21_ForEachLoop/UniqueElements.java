package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] name={"Caner","Caner","Melissa","Emine","Emine","Ece","Mustafa"};

        for (String s : name) {
            int count=0;
            for (String s1 : name) {
                if(s.equals(s1))
                    count++;
            }if(count==1)
                System.out.println(s);
        }
    }
}
