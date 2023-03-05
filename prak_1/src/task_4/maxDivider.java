package task_4;

import java.util.Scanner;
import java.util.function.Function;

public class maxDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int second = scanner.nextInt();
        Function<Integer, Integer> function =  first -> {
            Integer i = 1, max = 1;
            while (i <= first && i <= second){
                if (first % i == 0 && second % i == 0){
                    max = i;
                }
                ++i;
            }
            return max > 1 ? max : 1;
        };
        System.out.println(function.apply(6));
    }
}
