public class TwoDArray {
  public static void main(String[] args) {
      int[][] array = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      System.out.println("Odd numbers in the 2D array:");
      for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array[i].length; j++) {
              if (array[i][j] % 2 != 0) {
                  System.out.print(array[i][j] + " ");
              }
          }
      }
  }
}
