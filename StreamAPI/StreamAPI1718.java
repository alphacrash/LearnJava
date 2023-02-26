package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPI1718 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer i) {
                return i % 5 == 0;
            }
        };

        System.out.println("Result : " + values.stream().filter(p).reduce(0, Integer::sum));
    }
}
