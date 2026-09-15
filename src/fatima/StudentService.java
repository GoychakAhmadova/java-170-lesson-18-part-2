package fatima;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void showAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void insertStudent(Student student) {
        students.add(student);
    }

    public void deleteStudentById(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public void updateSubjects(int id, List<String> subjects) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setSubjects(subjects);
            }
        }
    }

    public List<Student> filterByGpa(double gpa) {
        return students.stream()
                .filter(student -> student.getGpa() >= gpa)
                .toList();
    }

    public List<Student> findBySubject(String subject) {
        return students.stream()
                .filter(student -> student.getSubjects().contains(subject))
                .toList();
    }
}
