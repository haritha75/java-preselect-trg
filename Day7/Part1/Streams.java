import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream().map(x -> x * x).forEach(x -> System.out.print(x+" "));
    }
}
