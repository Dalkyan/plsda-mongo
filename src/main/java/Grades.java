import com.mongodb.DBObject;

import java.io.Serializable;

/**
 * Created by Lukasz on 17.03.2018.
 */
public class Grades {

    private String grade;
    private int score;

    public Grades() {
    }

    public Grades(String grade, int score) {
        this.grade = grade;
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
