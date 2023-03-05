package task_6;

import java.util.Comparator;

public class StudentComporator {
    public static void main(String[] args) {
        Comparator<Student> function = (stud1, stud2) -> stud1.getPoints() < stud2.getPoints() ? -1 : (stud1.getPoints() == stud2.getPoints() ? 0 : 1);
        Student student2 = new Student("Petr", 75), student1 = new Student("Sasha", 75);
        System.out.println(function.compare(student2, student1));
//        Comparator<Double> function2 = (stud1, stud2) -> stud1 < stud2 ? -1 : (stud1.doubleValue() == stud2.doubleValue() ? 0 : 1);
//        System.out.println(function2.compare(student2.getPoints(), student1.getPoints()));
    }
}
