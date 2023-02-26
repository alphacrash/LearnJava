package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI1711 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            values.add(i);
        }

        // For Each
        values.stream().forEach(System.out::println);

        // Stream Introduction - Once used, cannot be reused again
        List<Integer> newValues = Arrays.asList(1,2,3);

        Stream<Integer> s = newValues.stream();

        s.forEach(System.out::println); // will work
        s.forEach(System.out::println); // exception
    }
}
