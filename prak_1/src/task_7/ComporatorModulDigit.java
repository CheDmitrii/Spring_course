package task_7;

import java.util.Comparator;

public class ComporatorModulDigit {
    public static void main(String[] args) {
        Comparator<Integer> function = (digit1, digit2) -> {
            int dig1 = digit1 >= 0 ? digit1 : -digit1, dig2 = digit2 >= 0 ? digit2 : -digit2;
            return dig1 < dig2 ? -1 : (dig1 == dig2 ? 0 : 1);
        };
        System.out.println(function.compare(-9, 9));
    }
}
