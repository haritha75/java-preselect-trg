import java.util.Scanner;

public class HollowPyramidPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter  the number of rows:");
    int rows = sc.nextInt();
    for(int i=1;i<=rows-1;i++) {
      for(int j=1;j<=rows-i;j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for(int j=2;j<=i*2-1;j++) {
        System.out.print(" ");
      }
      if(i!=1)
        System.out.print("*");
      System.out.println();
    }
    for(int j=1;j<=rows*2-1;j++) {
      System.out.print("*");
    }

  }
  
}
