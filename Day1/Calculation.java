public class Calculation {
  public static void main(String[] args) {
      int number = 2345;

      number += 8;

      int quotient = number / 3;

      int modulus = quotient % 5;

      int result = modulus * 5;

      System.out.println("Final result: " + result);
  }
}
