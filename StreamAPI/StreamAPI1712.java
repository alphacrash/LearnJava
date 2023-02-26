package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPI1712 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Enhanced for loop
        int result = 0;
        for (int i : values) {
            result += i * 2;
        }
        System.out.println("Result: " + result);

        // Stream - Map
        System.out.println("Stream Result: " + values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
    }
}
