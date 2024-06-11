public class TwoXTwo {

  public static void main(String[] args) {
    
    int n=4;
    int m=4;
    for(int k=1;k<=4;k++){
      for(int i=1;i<=n-1;i++) {
        for(int j=1;j<=m;j++) {
       for(int f=1;f<=m;f++) {
        if(i==1||j==1||j==m) {
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
    for(int h=1;h<=4;h++) {
      System.out.print("*");

    }
  }
  
}
