import java.util.Scanner;

public class GCD_HCF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("The GCD/HCF of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        int rem =1;
        for(int i=2;i<=Math.min(a,b);i++) {
          if((a%i)==0 && (b%i)==0)
            rem = i;
        }
        return rem;
    }
    
}
