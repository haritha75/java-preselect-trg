/* Write a program to find the sum and product of all elements of an array. */
public class SumAndProductArray {
  public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5};

      int sum = 0;
      long product = 1;

      for (int num : array) {
          sum += num;
          product *= num;
      }

      System.out.println("Sum of all elements: " + sum);
      System.out.println("Product of all elements: " + product);
  }
}
