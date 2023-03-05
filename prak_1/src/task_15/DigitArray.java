package task_15;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class DigitArray {
    public static void main(String[] args) {
        Consumer<Integer[]> function = integers -> Stream.of(integers).sorted().forEach(System.out::println);
        function.accept(new Integer[]{9, 3, 8, 4, 7, 5, 6, 1});
    }
}
