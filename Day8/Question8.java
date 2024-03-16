import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows :");
    int rows = sc.nextInt();

    char ch = 'A';
    int h=1;
    for(int i=1;i<=rows;i++) {
      if(i==1) {
        for(int j=1;j<=rows-i;j++){
          System.out.print(" ");
        }System.out.print((char)(ch++));
        
      }
      

      if(i>=2 && i<rows) {
        for(int j=1;j<=rows-i;j++) {
          System.out.print(" ");
        }
        System.out.print((char)ch++);
        for(int j=1;j<=h;j++) {
          System.out.print(" ");
        }
        h +=2;
        System.out.print((char)ch++);

      }
      if(i!=rows-1) {
        System.out.println();
      }
      if(i==rows) {
        for(int j=1;j<=rows*2-1;j++) {
          System.out.print((char)ch++);
        }
      }
    }
    
  }
  
}
