package task_12;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class MaxPionts {
    public static void main(String[] args) {
        Predicate<Students[]> function = students -> Stream.of(students).filter(students1 -> students1.getPoints() == 100).count() > 0;
        Students[] students = {new Students("Dima", 91), new Students("Sasha", 89), new Students("Petya", 10)};
        System.out.println(function.test(students));
    }
}
