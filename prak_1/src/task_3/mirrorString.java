package task_3;

import java.util.function.Function;
import java.util.stream.Stream;

public class mirrorString {
    public static void main(String[] args) {
        Function<String[], String[]> function = strings -> {
            String[] string = new String[strings.length];
            for(int i = 0; i < string.length; ++i){
                string[i] = strings[strings.length - 1 - i];
            }
            return string;
        };

        String[] arr = {"qqq", "www", "eee", "rrr"};
        for (String i : function.apply(arr)){
            System.out.print(i + " ");
        }
    }
}
