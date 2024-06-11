import java.util.Scanner;

public class Hollow_diamond_star_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
                if (n % 2 == 0) {
                    System.out.println("Please enter an odd number for the size of the diamond.");
                    return;
                }
                int mid = n/ 2;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i + j == mid || i - j == mid || j - i == mid || i + j == (n - 1) + mid) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }