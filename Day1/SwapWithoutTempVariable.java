public class SwapWithoutTempVariable {
  public static void main(String[] args) {
      int a = 6;
      int b = 8;

      System.out.println("Original values: a = " + a + ", b = " + b);

      a = a + b;
      b = a - b;
      a = a - b;

      System.out.println("Swapped values: a = " + a + ", b = " + b);
  }
}
