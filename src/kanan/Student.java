package kanan;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {
    String id;
    String name;
    double gpa;
    List<String> subjects;

    public Student(String id, String name, double gpa, List subjects) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.subjects = new ArrayList<>(subjects) ;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public List<String> getSubjects() { return subjects; }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | GPA: " + gpa + " | Subjects: " + subjects;
    }

}

