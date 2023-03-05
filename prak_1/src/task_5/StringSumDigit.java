package task_5;

import java.util.Comparator;

public class StringSumDigit {
    public static void main(String[] args) {
        Comparator<String> function = (string1, string2) -> {
            Integer sum1 = 0, sum2 = 0;
            for (int i = 0; i < string1.length(); i++){
                if (Character.isDigit(string1.charAt(i))){
                    sum1 += Integer.valueOf(string1.charAt(i));
                }
            }
            for (int i = 0; i < string2.length(); i++){
                if (Character.isDigit(string2.charAt(i))){
                    sum2 += Integer.valueOf(string2.charAt(i));
                }
            }
            return sum1 < sum2 ? -1 : (sum1 == sum2 ? 0 : 1);
        };
        System.out.println(function.compare("13m233mt", "999ytur99"));
    }
}
