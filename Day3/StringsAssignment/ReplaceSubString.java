import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String substring = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        String newSentence = replaceSubstring(sentence, substring, replacement);
        System.out.println("New sentence: " + newSentence);

        scanner.close();
    }

    public static String replaceSubstring(String sentence, String oldSubstring, String newSubstring) {
        return sentence.replace(oldSubstring, newSubstring);
    }
}
