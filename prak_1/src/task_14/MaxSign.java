package task_14;

import java.util.function.Consumer;
import java.util.stream.Stream;

//TODO: what is the unique sign

public class MaxSign {
    public static void main(String[] args) {
        Consumer<String[]> function = strings -> Stream.of(strings).forEach(n -> n.replaceAll("[^\\!@#$%^&*]*", ""));
    }
}
