/* Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest */
import java.util.Scanner;

public class MaxAndMindifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

       
        java.util.Arrays.sort(array);

        int maxDifference = array[n - 1] - array[0];

        int minDifference = array[1] - array[0];

        for (int i = 2; i < n; i++) {
            minDifference = Math.min(minDifference, array[i] - array[i - 1]);
        }

        System.out.println("Maximum difference: " + maxDifference);
        System.out.println("Minimum difference: " + minDifference);

    }
}
