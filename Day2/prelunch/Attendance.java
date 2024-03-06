import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;

        boolean allowedToSit = attendancePercentage >= 75;

        System.out.print("Do you have a medical cause? (Y/N): ");
        char hasMedicalCause = scanner.next().charAt(0);

        if (hasMedicalCause == 'Y' || hasMedicalCause == 'y') {
            allowedToSit = true;
        }

        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        if (allowedToSit) {
            System.out.println("Student is allowed to sit in the exam.");
        } else {
            System.out.println("Student is not allowed to sit in the exam.");
        }

    }
}
