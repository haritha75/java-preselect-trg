// The right triangle star pattern is also the same as the left triangle star pattern but it has a shape of a triangle with its perpendicular line at the right side.

import java.util.Scanner;
public class RightTriangle {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows :");
    int rows = sc.nextInt();
    for(int i=1;i<=rows;i++) {
      for(int j=1;j<=rows-i;j++) {
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
  
}
