import java.util.Scanner;

public class RightPascalsTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows:");
    int rows = sc.nextInt();
    for(int i=1;i<=rows;i++) {
      for(int j=1;j<=i;j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=2;i<=rows;i++) {
      for(int  j=1;j<=rows-i+1;j++) {
        System.out.print("*");

      }
      System.out.println();
    }
  }
  
}
