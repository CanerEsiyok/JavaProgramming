package day31_Constructors;

import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1=new Movie("USA","Journey to SDET: Cydeo Batch 25","10/25/2021","Kuzzat Altay");
        //System.out.println(movie1);

        movie1.addCast("Caner");
        System.out.println(movie1);
        String[] actors={"Jennifer","Keira","Jonny","Leo"};
        movie1.addCast(actors);
        System.out.println(movie1);

    }
}
