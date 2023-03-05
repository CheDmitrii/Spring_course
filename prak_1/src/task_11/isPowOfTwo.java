package task_11;

import java.util.function.Predicate;

public class isPowOfTwo {
    public static void main(String[] args) {
        Predicate<Integer> function = integer -> {
            if (integer <= 0){
                return false;
            }
            while (integer % 2 == 0){
                integer /= 2;
            }
            return integer == 1;
        };
        System.out.println(function.test(34));
    }
}
