package task_12;

public class Students {
    private String name;
    private String group;
    private double points;

    public Students() {
    }

    public Students(String name, double points) {
        this.name = name;
        this.points = points;
    }

    public Students(String name, String group, double points) {
        this.name = name;
        this.group = group;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
}
