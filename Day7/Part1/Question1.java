import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows :");
    int rows = sc.nextInt();

    for(int i = 1; i <= rows; i++) {
      if(i == 1 || i == rows) {
        for(int j = 1; j <= rows; j++) {
          System.out.print("*");
        }
        System.out.println(); 
      }
      else if(i >= 2 && i < rows) { 
        for(int j = 1; j <= rows; j++) {
          if(j == 1 || j == rows) {
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
        System.out.println(); 
      }
    }
  }
}
