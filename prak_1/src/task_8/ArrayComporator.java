package task_8;

import java.util.Comparator;

public class ArrayComporator {
    public static void main(String[] args) {
        Comparator<Integer[]> function = (array1, array2) -> array1.length < array2.length ? -1 : (array1.length == array2.length ? 0 : 1);
        System.out.println(function.compare(new Integer[]{1, 3, 4, 3, 2, 4}, new Integer[]{3, 5, 4, 2}));
    }
}
