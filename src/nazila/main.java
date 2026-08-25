package nazila;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        insertStudent(new Student(1, "ALi", 88.8, new ArrayList<>(Arrays.asList("Riyaziyyat", "Fizika"))));
        insertStudent(new Student(2, "Zeyneb", 77, new ArrayList<>(Arrays.asList("Edebiyyat", "Tarix"))));
        insertStudent(new Student(3, "Sevil", 66, new ArrayList<>(Arrays.asList("Kimya", "Biologiya"))));

        System.out.println("All Students: ");
        showAllStudents();

        System.out.println("Update Student: ");

        updateStudents(1, new ArrayList<>(Arrays.asList("Riyaziyyat", "Kimya")));
        showAllStudents();

        System.out.println("Delete Student: ");

        deleteStudentById(2);


    }

    public static void insertStudent(Student student) {
        students.add(student);
        System.out.println(student.getName());
    }

    public static void showAllStudents() {
        if (students.isEmpty()) {
            return;
        }
        students.forEach(System.out::println);

    }

    public static void updateStudents(int id, List<String> newSubjects) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setSubjects(newSubjects);
                System.out.println("Update subjects");
                return;
            }
            System.out.println(id);

        }
    }

    public static void deleteStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("ID-si " + id + " olan telebe silindi.");
                return;
            }

        }
    }
}
