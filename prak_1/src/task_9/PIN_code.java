package task_9;

import java.util.function.Predicate;

public class PIN_code {
    public static void main(String[] args) {
        Predicate<String> function = string -> string.matches("^((\\D*\\d\\D*){4})$|^((\\D*\\d\\D*){6})$");
        System.out.println(function.test("ttyy2333rr"));
    }
}
