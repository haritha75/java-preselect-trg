import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
    
    System.out.print("Enter number of rows :");
    int rows = sc.nextInt();
    int h=1;
    for(int i=1;i<=rows;i++) {
      if(i==1) {
        for(int j=1;j<=rows-1;j++) {
          System.out.print(" ");
        }
        System.out.print(1);
      }
     
        if(i>=2 && i<=rows) {
          for(int j=1;j<=rows-i;j++) {
            System.out.print(" ");
          }
          System.out.print(1);
        
          for(int j=1;j<=h;j++) {
            System.out.print(" ");
          }
          h +=2;
          System.out.print(2);
        }
      
          System.out.println();
  }
  int l = rows;
  for(int i=2;i<=rows-1;i++) {
    for(int j=1;j<=i-1;j++) {
      System.out.print(" ");
    }
    System.out.print(1);
    for(int j=1;j<=l;j++) {
      System.out.print(" ");
    }
    l -=2;
    System.out.print(2);
    System.out.println();
    
  }
  for(int j=1;j<=rows-1;j++) {
    System.out.print(" ");
  }
  System.out.println(1);
  
  }
}
