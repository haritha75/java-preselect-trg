import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        for(int k=0;k<str.length()/2;k++) {
          if(str.charAt(i)!=str.charAt(j)) {
            return false;
          }
          i++;
          j--;
        }
        return true;
    }
}
