import java.util.Scanner;

public class HollowSqaure {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter  the size of square:");
    int rows = sc.nextInt();
    for(int i=1;i<=rows;i++) {
      if(i==1) {
        for(int j=1;j<=rows;j++) {
          System.out.print("*");
        }
        System.out.println();

      }
      if(i>=2 && i<=rows-1) {
      for(int j=1;j<=rows;j++) {
        if(j==1 || j==rows) {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }

      if(i==rows) {
        for(int j=1;j<=rows;j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      
    }
  }
  
}
