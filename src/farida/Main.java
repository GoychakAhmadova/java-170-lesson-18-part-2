package farida;

import java.util.Arrays;

import static farida.StudentService.*;

public class Main {
    public static void main(String[] args) {
// Test data
        addStudent(new Student(1, "Aydan", 77.8, Arrays.asList("Java", "PostgreSQL")));
        addStudent(new Student(2, "Ali", 88.9, Arrays.asList("Math", "Java")));
        addStudent(new Student(3, "Sara", 93.5, Arrays.asList("English", "History")));

        showAllStudents();

        updateStudentSubjects(2, Arrays.asList("Math", "Algorithms"));
        deleteStudentById(3);

        System.out.println("\n Students with GPA >= 80.0 ");
        filterByGpa(80.0).forEach(System.out::println);

        System.out.println("\n Students taking Java ");
        findBySubject("Java").forEach(System.out::println);

        showAllStudents();
    }
}
