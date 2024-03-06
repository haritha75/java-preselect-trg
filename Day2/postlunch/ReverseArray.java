/* Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order. */
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] originalArray = new int[10];
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
         
                System.out.print("Enter integer " + (i + 1) + ": ");
                originalArray[i] = scanner.nextInt();
        
        }
        
        int[] reversedArray = new int[10];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        System.out.println("\nThe elements in reverse order are:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }

      
    }
}
