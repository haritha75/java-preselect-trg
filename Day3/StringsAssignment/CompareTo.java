import java.util.Arrays;

public class CompareTo {
    public static void main(String[] args) {
        String[] friends = {
            "Charlie", "Alice", "Bob", "David", "Emma",
            "Ivan", "Hannah", "Frank", "Jack", "Grace"
        };

        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (friends[i].compareTo(friends[j]) > 0) {
                    String temp = friends[i];
                    friends[i] = friends[j];
                    friends[j] = temp;
                }
            }
        }

        System.out.println("Friends in alphabetical order:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
