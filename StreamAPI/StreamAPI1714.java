package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamAPI1714 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream s = values.stream();

        Stream s1 = s.map(new Function<Integer, Integer>() {
            public Integer apply(Integer i) {
                return i * 2;
            }
        });
        Integer result = (Integer) s1.reduce(0, new BinaryOperator<Integer>() {
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        });

        System.out.println(values.stream());
        System.out.println("Result: " + result);
    }
}
