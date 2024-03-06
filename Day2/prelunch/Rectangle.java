import java.util.Scanner;

/**
 * The Rectangle class allows the user to input the length and breadth of a rectangle and determines whether it's a square or not.
 *
 * @author Haritha
 * @version 1.0
 * @since 06-03-2024
 */
public class Rectangle {

    /**
     * The main method prompts the user to enter the length and breadth of a rectangle, and then determines whether it's a square or not.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }

    }
}
