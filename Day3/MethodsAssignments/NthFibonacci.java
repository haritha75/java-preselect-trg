import java.util.Scanner;
public class NthFibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = fibonacci(n);
    System.out.println("The " + n + "th term of Fibonacci series is: " + result);
  }

  public static int fibonacci(int n) {
      if (n==0 || n == 1) {
          return n;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
