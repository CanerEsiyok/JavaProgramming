package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country,title,genre,releaseDate,director;
    public ArrayList<String> cast=new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String str){
        cast.add(str);
    }
    public void addCast(String[] arr){
        cast.addAll(Arrays.asList(arr));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts='" + cast.size() + '\'' +
                '}';
    }
}
