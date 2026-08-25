package farida;

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
        this.subjects = subjects;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public List<String> getSubjects() { return subjects; }
    public void setSubjects(List<String> subjects) { this.subjects = subjects; }

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
