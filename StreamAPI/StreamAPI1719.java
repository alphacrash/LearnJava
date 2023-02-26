package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPI1719 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        System.out.println("Result : " +
                values.stream()
                        .filter(i -> i % 5 == 0)
                        .map(i -> i * 2)
                        .findFirst()
                        .orElse(0));
    }
}
