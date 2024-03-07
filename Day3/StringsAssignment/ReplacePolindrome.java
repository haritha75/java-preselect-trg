import java.util.Scanner;

public class ReplacePolindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String replacedString = replacePalindrome(input);
        System.out.println("Replaced string: " + replacedString);

    }

    public static String replacePalindrome(String str) {
        String[] words = str.split(" ");
        StringBuilder replacedString = new StringBuilder();

        for (String word : words) {
            if (isPalindrome(word)) {
                replacedString.append("*".repeat(word.length())).append(" ");
            } else {
                replacedString.append(word).append(" ");
            }
        }

        return replacedString.toString().trim();
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
