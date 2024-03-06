/* Take 10 integer inputs from user and store them in an array and print them on screen. */
import java.util.Scanner;

public class InputAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            inputs[i] = scanner.nextInt();
        }

        System.out.println("The integers you entered are:");
        for (int num : inputs) {
            System.out.print(num + " ");
        }

    }
}
