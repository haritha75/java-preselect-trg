import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Maximum number: " + findMaximum(num1, num2, num3));
        System.out.println("Minimum number: " + findMinimum(num1, num2, num3));

    }

    public static int findMaximum(int num1, int num2, int num3) {
      if (num1 >= num2 && num1 >= num3) {
          return num1;
      }
      else if (num2 >= num1 && num2 >= num3) {
          return num2;
      }
      else {
          return num3;
      }
    }

    public static int findMinimum(int num1, int num2, int num3) {

      if (num1 <= num2 && num1 <= num3) {
        return num1;
      } 
      else if (num2 <= num1 && num2 <= num3) {
        return num2;
      } 
      else {
        return num3;
     }
     
    }
}
