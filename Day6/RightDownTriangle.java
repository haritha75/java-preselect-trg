import java.util.Scanner;
public class RightDownTriangle {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Rows :");
    int rows = sc.nextInt();
    for(int i=1;i<=rows;i++) {
      for(int j=1;j<=i-1;j++) {
        System.out.print(" ");
      }
      for(int k=1;k<=rows-i+1;k++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
  
}
