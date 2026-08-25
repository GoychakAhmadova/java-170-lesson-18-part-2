package shamil;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private double gpa;
    private List<String> subjects;

    public Student(int id, String name, double gpa, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.subjects = new ArrayList<>(subjects);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = new ArrayList<>(subjects);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", subjects=" + subjects +
                '}';
    }
}