package student_record;

public class StudentRecord {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Damon", 100, 100, 100);
        StudentDetails student2 = new StudentDetails("Elena", 70, 78, 45);
        StudentDetails student3 = new StudentDetails("Stefan", 93, 95, 100);
        StudentDetails student4 = new StudentDetails("Bonnie", 78, 99, 90);
        student3.print("Stefan", 93, 95, 100);
        student1.print("Damon", 100, 100, 100);
        int studentCount = StudentDetails.getStudentCount();
        System.out.println(studentCount);


//        student1.setName("Damon");
//        student1.setMathScore(100);
//        student1.setScienceScore(100);
//        student1.setHistoryScore(100);

//        StudentDetails student2= new StudentDetails();
//        student2.setName("Elena");
//        student2.setMathScore(70);
//        student2.setScienceScore(78);
//        student2.setHistoryScore(45);
//
//        StudentDetails student3= new StudentDetails();
//        student3.setName("Stefan");
//        student3.setMathScore(93);
//        student3.setScienceScore(95);
//        student3.setHistoryScore(100);
//
//        StudentDetails student4= new StudentDetails();
//        student4.setName("Bonnie");
//        student4.setMathScore(78);
//        student4.setScienceScore(99);
//        student4.setHistoryScore(90);
    }

}
