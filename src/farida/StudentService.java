package farida;
import java.util.ArrayList;
import java.util.List;


public class StudentService {
    private static final List<Student> students = new ArrayList<>();

    public static void showAllStudents() {
        System.out.println(" All Students ");
        students.forEach(System.out::println);
    }


    public static void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }


    public static void deleteStudentById(int id) {
        boolean removed = students.removeIf(student -> student.getId() == id);
        if (removed) {
            System.out.println("Student with ID " + id + " was deleted.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }


    public static void updateStudentSubjects(int id, List<String> newSubjects) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setSubjects(newSubjects);
                System.out.println("Subjects updated for student with ID " + id);
                return;
            }
        }
        System.out.println("Student not found.");
    }

}