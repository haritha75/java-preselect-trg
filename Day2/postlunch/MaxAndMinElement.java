/* Find largest and smallest elements of an array. */
public class MaxAndMinElement {
  public static void main(String[] args) {
      int[] array = {12, 45, 67, 23, 9, 56, 32, 8};

      int largest = array[0];
      int smallest = array[0]; 

      for (int i = 1; i < array.length; i++) {
          if (array[i] > largest) {
              largest = array[i];
          } else if (array[i] < smallest) {
              smallest = array[i];
          }
      }

      System.out.println("Largest element: " + largest);
      System.out.println("Smallest element: " + smallest);
  }
}
