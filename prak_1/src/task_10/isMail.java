package task_10;

import java.util.function.Predicate;

public class isMail {
    public static void main(String[] args) {
        Predicate<String> function = string -> string.matches("^[0-9a-zA-Z]+@(mail\\.(ru|com|uk)|gmail\\.(ru|com)|yandex\\.ru)$");
        System.out.println(function.test("rtyeuiry@mail.ru"));
    }
}
