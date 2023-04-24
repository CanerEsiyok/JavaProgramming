package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        String word[]={"Java","Java","C#","Python","Python","Laptop","Mouse"};

        for (int i = 0; i < word.length; i++) {
            int count=0;
            for (int i1 = 0; i1 < word.length; i1++) {
                if(word[i].equals(word[i1]))
                    count++;


            }if(count==1)
                System.out.println(word[i]);

    }
}}
