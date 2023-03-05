package task_6;

public class Student {
    private String name;
    private double points;
    private String group;

    public Student() {
    }

    public Student(String name, double points) {
        this.name = name;
        this.points = points;
    }

    public Student(String name, double points, String group) {
        this.name = name;
        this.points = points;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
