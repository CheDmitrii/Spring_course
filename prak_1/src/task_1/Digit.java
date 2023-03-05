package task_1;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Digit {
    public static void main(String[] args) {
        Function<Integer[], String> function = (array) -> {
            Stream<Integer> integerStream = Arrays.stream(array).distinct().sorted();
            StringBuilder str = new StringBuilder();
            integerStream.forEach(str::append);
            return str.toString();
        };
        Integer[] arr = {1, 2, 7, 3, 9, 2, 6};
        System.out.println(function.apply(arr));
    }
}
