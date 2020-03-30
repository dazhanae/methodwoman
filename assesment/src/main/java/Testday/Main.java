package Testday;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(null);
        double[]scores = {69.0, 78.0, 88.0};
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        System.out.println(Arrays.toString());
        System.out.println(null.totalScores(scores));
        System.out.println(null.calculateAvergeScore(scores));
    }
}
