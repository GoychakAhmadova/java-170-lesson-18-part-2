package shamil;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public void showAllStudents() {
        students.forEach(System.out::println);
    }

    public void insertStudent(Student student) {
        students.add(student);
    }

    public void deleteStudentById(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public void updateSubjects(int id, List<String> subjects) {
        students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .ifPresent(student -> student.setSubjects(subjects));
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
