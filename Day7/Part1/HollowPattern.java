import java.util.Scanner;

public class HollowPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter odd number of rows :");
    int rows = sc.nextInt();
    for(int i=1;i<=rows;i++) {
      for(int j=1;j<=rows-i;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      int k=i;
      for(int j=1;j<=i-1;j++) {
        System.out.print(" ");
        k +=2;
      }
      System.out.print("*");

      System.out.println();
    }
  }
  
}
