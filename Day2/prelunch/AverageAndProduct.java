import java.util.Scanner;

public class AverageAndProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int product = 1;
        int count = 0;
        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                continueInput = false;
            } else {
               
                    int num = Integer.parseInt(input);
                    sum += num;
                    product *= num;
                    count++;
               
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of all numbers: " + average);
            System.out.println("Product of all numbers: " + product);
        } else {
            System.out.println("No numbers entered.");
        }

    }
}
