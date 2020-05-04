package Testday;

import java.sql.Array;
import java.util.Arrays;

public class Student {
    private String firstName, lastName;
    private Double[] scores;

    public Student(String firstName, String lastName, Double[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getScores() {
        return scores;
    }

    public void setScores(Double[] scores) {
        this.scores = scores;
    }

    //Method to add Grades
    public Double totalScores() {
        Double total = 0.0;
        for (int x = 0; x < scores.length; x++) {
            total += scores[x];
        }
        return total;
    }

    //Method to calculate average grade
    public Double calculateAverageGrade() {
        return totalScores() / scores.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }


}


