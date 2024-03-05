public class SwapUsingTempVariable {
  public static void main(String[] args) {
      int a = 6;
      int b = 8;

      System.out.println("Original values: a = " + a + ", b = " + b);

      int temp = a;
      a = b;
      b = temp;

      System.out.println("Swapped values: a = " + a + ", b = " + b);
  }
}
