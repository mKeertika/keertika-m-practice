/*[In-Dog Lab exercise: Method overloading] - We will do this right after we finish the coverage “Overloading Methods” (slide #33-#36) of this presentation
        Refactor the “StudentRecord” class to add the following two overloaded “print(..)” methods
public void print(String name)
public void print(String name, double averageScore)
        Refactor “Main” class above to use the above methods appropriately*/
package student_record;

public class StudentDetails {
    private String name;

    public static int getStudentCount() {
        return studentCount;
    }

    static int studentCount = 0;
    private double mathScore;
    private double scienceScore;
    private double historyScore;
    private double averageScore;

    //    public StudentDetails() {
//        studentCount++;
//    }
    public StudentDetails(String name) {
        studentCount++;
        this.name = name;
    }

    public StudentDetails(String name, double mathScore, double scienceScore, double historyScore) {
        this(name);
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.historyScore = historyScore;
    }

    public StudentDetails(String name, double averageScore) {
        this(name);
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }

    public double getHistoryScore() {
        return historyScore;
    }

    public double getAverageScore() {
        return averageScore;
    }


    public void print(String name) {
        System.out.println("Student name: " + name);
    }

    public void print(double mathScore, double scienceScore, double historyScore) {
        System.out.println("Math score: " + mathScore + ", Science Score: " + scienceScore + ", History Score: " + historyScore);
    }

    public void print(String name, double mathScore, double scienceScore, double historyScore) {
        double avgScore = (mathScore + scienceScore + historyScore) / 3;
        System.out.println(name + "'s average score is: " + avgScore);
    }
}