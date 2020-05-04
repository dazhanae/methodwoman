public class Student {
    //step one properties
    private int  NumberOfExamsTaken;
    private String firstName;
     private String lastName;
     Double[] examScores;
     //Construct properties
     public Student (String firstName, String lastName, Double[] examScores) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.examScores = examScores;
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

    public String getExamScores() {
        return String.valueOf(examScores);
    }

     public int getNumberOfExamsTaken() {
         return NumberOfExamsTaken;
         }
    public double addExamScore(double examScore) {
        return examScore;
     }

    }


