package Rashad;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private List<String> subject;

    public Student(int id, String name, double gpa, List<String> subject) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.subject = subject;
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public double getGap () {
        return gpa;
    }

    public List<String> getSubjects() {
        return subject;
    }

    @Override
    public String toString() {
        return "String{" +
            "id" + id + "name" + name + "gap" + gpa + "subject" + subject + '}';
        }
    }

