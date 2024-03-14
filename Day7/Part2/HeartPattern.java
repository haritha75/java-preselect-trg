import java.util.Scanner;

public class HeartPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter  even number of rows:");
    int rows = sc.nextInt();
    System.out.print("  ");
    for(int j=1;j<=rows/2;j++) {
      System.out.print("*");
    }
    for(int i=1;i<=rows/2;i++) {
      System.out.print(" ");
    }
    for(int i=1;i<=rows/2;i++) {
      System.out.print("*");
    } System.out.println();

    System.out.print(" ");
    for(int i=1;i<=rows-1;i++) {
      System.out.print("*");
    }
    System.out.print(" ");

    for(int i=1;i<=rows-1;i++) {
      System.out.print("*");
    }
    System.out.println();
    for(int i=1;i<=rows;i++) {
    
      for(int j=1;j<=i;j++) {
        System.out.print(" ");
      }
      for(int j=1;j<=rows-i+1;j++) {
        System.out.print("*");
      }
      for(int j=1;j<=rows-i;j++) {
        System.out.print("*");
      }
      
      System.out.println();
    }
  }
  
}
