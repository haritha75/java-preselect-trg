/* Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not. */
import java.util.Scanner;

public class ElementPresentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
           
                System.out.print("Enter integer " + (i + 1) + ": ");
                inputs[i] = scanner.nextInt();
            
        }

        System.out.print("Enter a number to check if it's present in the array: ");
        int numToCheck = scanner.nextInt();

        for(int i=0;i<inputs.length;i++) {
          if(inputs[i]==numToCheck) {
            System.out.println(numToCheck + " is present in the array.");
            return;

          }

        }
        System.out.println(numToCheck + " is not present in the array.");
        

       
    }
}
