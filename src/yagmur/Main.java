package yagmur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Student> students = new ArrayList<>();

    public static void showAllStudents(List<Student> students) {
        if(students.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            for(Student s : students) {
                System.out.println(s);
            }
        }
    }

    public static void insertNewStudent(Student student) {
        students.add(student);
        System.out.println("Student inserted successfully.");
    }

    public static void deleteById(int id) {
        for(Student s: students) {
            if(s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully.");
               // return;
            }
        }
    }

    public static void updateStudent(int id, List<String> newSubjects) {
        for(Student s: students) {
            if(s.getId() == id) {
                s.setSubjects(newSubjects);
                System.out.println("Student updated successfully.");
            }
        }
    }

    static void main() {
        Student student1 = new Student(1, "Ayse", 75.77, Arrays.asList("Math", "Chemistry", "English"));
        Student student2 = new Student(2, "Ali", 82.50, Arrays.asList("Math", "Physics", "Computer Science"));
        Student student3 = new Student(3, "Leyla", 91.20, Arrays.asList("Biology", "Chemistry", "Literature"));
        Student student4 = new Student(4, "Murad", 68.45, Arrays.asList("History", "Geography", "English"));
        Student student5 = new Student(5, "Nigar", 88.90, Arrays.asList("Math", "Physics", "English"));
        Student student6 = new Student(6, "Orxan", 74.30, Arrays.asList("Chemistry", "Biology", "Physical Education"));
        Student student7 = new Student(7, "Fatma", 95.00, Arrays.asList("Math", "Computer Science", "Literature"));
        Student student8 = new Student(8, "Elmir", 60.10, Arrays.asList("History", "Art", "Music"));
        Student student9 = new Student(9, "Zohrab", 85.60, Arrays.asList("Biology", "Chemistry", "Math"));
        Student student10 = new Student(10, "Kənan", 79.80, Arrays.asList("Physics", "Computer Science", "English"));

        Main.insertNewStudent(student1);
        Main.insertNewStudent(student2);
        Main.insertNewStudent(student3);
        Main.insertNewStudent(student4);
        Main.insertNewStudent(student5);
        Main.insertNewStudent(student6);
        Main.insertNewStudent(student7);
        Main.insertNewStudent(student8);
        Main.insertNewStudent(student9);
        Main.insertNewStudent(student10);

        Main.showAllStudents(students);

        Main.deleteById(3);

        Main.updateStudent(1, Arrays.asList("Math", "Physics", "Computer Science"));


    }

}
