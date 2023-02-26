package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPI1720 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        System.out.println("Normal way: ");
        int result = 0;
        for (int i : values) {
            System.out.println("Check if divisible : " + i);
            if (i % 5 == 0) {
                System.out.println("Double the value: " + i);
                result += i * 2;
                break;
            }
        }
        System.out.println("Normal Result: " + result);

        System.out.println("\nStream way: ");
        System.out.println("Stream result : " +
                values.stream()
                        .filter(StreamAPI1720::isDivisible)
                        .map(StreamAPI1720::doubleIt)
                        .findFirst()
                        .orElse(0));
    }

    public static boolean isDivisible(int i) {
        System.out.println("isDivisible: " + i);
        return i % 5 == 0;
    }

    public static int doubleIt(int i) {
        System.out.println("doubleIt: " + i);
        return i * 2;
    }
}
