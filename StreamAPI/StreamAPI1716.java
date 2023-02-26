package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPI1716 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer result = values.stream().map(i -> i * 2).reduce(0, Integer::sum);

        System.out.println("Result: " + result);
    }
}
