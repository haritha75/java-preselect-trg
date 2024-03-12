import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WithoutDuplicates {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] noDuplicateArray = createArrayWithoutDuplicates(rows, columns, scanner);

        System.out.println("2D Array with no duplicates numbers:");
        for(int i=0;i<rows;i++){
          for(int j=0;j<columns;j++){
              System.out.print(noDuplicateArray[i][j]+" ");
          }
          System.out.println();
      }
     
    }
    public static int[][] createArrayWithoutDuplicates(int rows, int columns, Scanner scanner) {
      int[][] array = new int[rows][columns];
      Set<Integer> containSet = new HashSet<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int number;
                do {
                    System.out.print("Please enter element at position (" + i + "," + j + "): ");
                    number = scanner.nextInt();
                } while (containSet.contains(number));
                array[i][j] = number;
                containSet.add(number);
            }
        }

      return array;
  }
  
}
