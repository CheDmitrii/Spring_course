package task_13;

import java.util.function.Consumer;

public class ThirdCharacter {
    static private String string;

    public static void main(String[] args) {
        Consumer<String> function = s -> {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                if ((i + 1) % 3 == 0 && (int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122){
                    str.append((char)(s.charAt(i) - 32));
                }else {
                    str.append(s.charAt(i));
                }
            }
            string = str.toString();
        };
        String str = "AAaAAaAAaaaA";
        function.accept(str);
        System.out.println(string);
    }
}
