public class MultiplicationTable {
  public static void main(String[] args) {
      int number = 15;
      System.out.println("Multiplication table of " + number + ":");
      printMultiplicationTable(number, 1);
  }

  public static void printMultiplicationTable(int number, int multiplier) {
    if(multiplier == 11)
         return;
    else{
          System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
          printMultiplicationTable(number, multiplier + 1);
      }
  }
}
