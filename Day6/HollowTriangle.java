import java.util.Scanner;
public class HollowTriangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter  the number of rows:");
    int rows = sc.nextInt();
    for(int i=1;i<=rows-1;i++) {
      for(int j=1;j<=i;j++) {
        if(j==1 || i==j) {
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
        
      }
      System.out.println();

    }
    for(int i=1;i<=rows;i++) {
      System.out.print("*");
    }
    
  }
  
}
