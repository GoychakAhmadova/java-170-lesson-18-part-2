package shamil;

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

    public void updateSubjects(int id, List<Subject> subjects) {
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

    public List<Student> findBySubject(String subjectName) {
        return students.stream()
                .filter(student -> student.getSubjects().stream()
                        .anyMatch(subject ->
                                subject.getName().equalsIgnoreCase(subjectName)))
                .toList();
    }
}