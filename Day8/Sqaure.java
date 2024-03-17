import java.util.Scanner;

public class Sqaure {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter each sqaure box number of rows :");
    int rows = sc.nextInt();
    System.out.print("enter how many times repeate the row:");
    int repeatRow = sc.nextInt();
    for(int k=1;k<=repeatRow;k++) {
      for(int i=1;i<=rows;i++) {
        for(int b=1;b<=repeatRow;b++){
          for(int j=1;j<=rows*2;j++){
            if(i==1)  {
              System.out.print("*");
            }
            
            else if(j==1 || (b==repeatRow &&  j==rows*2)) {
              System.out.print("*");
            }
              else{
              System.out.print(" ");
            }
          }
        }
        System.out.println();
      }
    }
    for(int h=1;h<=repeatRow;h++) {
      for(int i=1;i<=rows*2;i++) {
        System.out.print("*");
      }
    }
  }
  
}
