import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1 (out of 100): ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Enter marks for subject 2 (out of 100): ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Enter marks for subject 3 (out of 100): ");
        int subject3Marks = scanner.nextInt();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks;

        double percentageMarks = (totalMarks / 300.0) * 100;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage marks: " + percentageMarks + "%");

        scanner.close();
    }
}
