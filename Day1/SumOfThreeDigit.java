import java.util.Scanner;

public class SumOfThreeDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of the digits of " + originalNumber + ": " + sum);

    }
}
