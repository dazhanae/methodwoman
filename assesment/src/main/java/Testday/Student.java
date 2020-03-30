package Testday;

import java.sql.Array;
public class Student

    public Object firstname;

    public Student() {
    }
    public double[] scores = new double[]{69.0, 78.0, 88.0};

    public double[] getScores() {
        return scores;
    }

    public void setFirstname(String Firstname) {
        this.firstname = "Mike";
    }

    public void setLastname(String Lastname) {
        this.lastname = "Jones";
    }

    private String lastname;

    public void setScores(double[] scores) {
        this.scores = scores;
    }


    public String getFirstname() {
        String firstname = new String();
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Student(String firstname, String lastname, Array scores) {

    }
}
