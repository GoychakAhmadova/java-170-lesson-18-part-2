package sahiba;

import java.util.List;

public class Student {
    int id;
    String name;
    double gpa;
    List<String> subjects;

    public Student(double gpa, int id, String name, List<String> subjects) {
        this.gpa = gpa;
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubject() {
        return subjects;
    }
    public void setSubject(List<String> subject) {
        this.subjects = subject;
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

