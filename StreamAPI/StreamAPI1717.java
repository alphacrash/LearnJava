package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPI1717 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        int result = 0;
        for (int i : values) {
            if (i % 5 == 0) {
                result += i;
            }
        }
        System.out.println("Result: " + result);

        System.out.println("Stream Result: " + values.stream().filter(i -> i % 5 == 0).reduce(0, Integer::sum));
    }
}
