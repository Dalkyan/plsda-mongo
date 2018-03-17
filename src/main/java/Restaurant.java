import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz on 17.03.2018.
 */
public class Restaurant {

    private String borough;
    private String cuisine;
    private String name;
//    private ArrayList<Grades> grades;

    public Restaurant() {
    }

    public Restaurant(String borough, String cuisine, String name) {
        this.borough = borough;
        this.cuisine = cuisine;
        this.name = name;
//        this.grades = grades;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ArrayList<Grades> getGrades() {
//        return grades;
//    }
//
//    public void setGrades(ArrayList<Grades> grades) {
//        this.grades = grades;
//    }
}
