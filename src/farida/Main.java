package farida;

import java.util.Arrays;

import static farida.StudentService.*;

public class Main {
    public static void main(String[] args) {
// Test data
        addStudent(new Student(1, "Aydan", 3.8, Arrays.asList("Java", "PostgreSQL")));
        addStudent(new Student(2, "Ali", 2.9, Arrays.asList("Math", "Java")));
        addStudent(new Student(3, "Sara", 3.5, Arrays.asList("English", "History")));

        showAllStudents();

        updateStudentSubjects(2, Arrays.asList("Math", "Algorithms"));
        deleteStudentById(3);

        showAllStudents();
    }
}

