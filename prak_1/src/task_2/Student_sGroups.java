package task_2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Student_sGroups {
    public static void main(String[] args) {
        Function<Student[], Map<String, List<Student>>> function = array -> {
            Map<String, List<Student>> hashMap = new HashMap<>();
            for (Student i : array){
                if (!hashMap.containsKey(i.getGroup())){
                    hashMap.put(i.getGroup(), new ArrayList<>());
                }
                hashMap.get(i.getGroup()).add(i);
            }
            return hashMap;
        };


        Student[] arr = {new Student("KVBO-04-21", "Dmitrii"), new Student("KVBO-01-21", "Vasya"), new Student("KVBO-04-21", "Petya")};
        Map<String, List<Student>> map = function.apply(arr);
        for (String i : map.keySet()){
            System.out.print(i + ": ");
            for (Object j : map.get(i).toArray()){
                Student student = (Student) j;
                System.out.print(student.getName() + " ");
            }
            System.out.println();
        }

    }
}
