import java.util.Scanner;

public class ReversePyramid {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number of rows :");
    int rows = sc.nextInt();

    for(int i=1;i<=rows;i++) {
      for(int j=1;j<=i-1;j++) {
        System.out.print(" ");
      }
      for(int j=1;j<=rows-i+1;j++) {
        System.out.print("*");
      }
      for(int j=2;j<=rows-i+1;j++) {
        System.out.print("*");
      }
  
      System.out.println();
    }
  }
  
}
