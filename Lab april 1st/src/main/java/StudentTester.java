import java.util.Arrays;

public class StudentTester {

    public static void main(String[] args) {
        // Double [] examScores = {40.0, 60.0, 80.0, 100.0};
        Double [] examScores = {};
        Student student = new Student("Rebecca", "Willams", examScores);
        student.addExamScore(100.0);
        String output = student.getExamScores();
        System.out.println(output);
    }
}
