import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gross salary: ");
        double grossSalary = scanner.nextDouble();
        System.out.print("Enter your total savings: ");
        double totalSavings = scanner.nextDouble();

        double tax = taxCalculator(grossSalary, totalSavings);

        System.out.println("Tax calculated: Rs." + tax);

    }

    public static double taxCalculator(double grossSalary, double totalSavings) {
        double taxableIncome = grossSalary - Math.min(totalSavings, 100000);

        double tax = 0;
        if (taxableIncome <= 100000) {
            tax = 0;
        } else if (taxableIncome <= 200000) {
            tax = (taxableIncome - 100000) * 0.1;
        } else if (taxableIncome <= 500000) {
            tax = (20000) + (taxableIncome - 200000) * 0.2;
        } else {
            tax = (20000 + 60000) + (taxableIncome - 500000) * 0.3;
        }

        return tax;
    }
}
