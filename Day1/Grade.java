public class Grade {
  public static void main(String[] args) {
      int totalStudents = 90;

      int boys = 45;

      int gradeA = totalStudents / 2;

      int boysGradeA = 20;

      int girlsGradeA = gradeA - boysGradeA;

      System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
  }
}
