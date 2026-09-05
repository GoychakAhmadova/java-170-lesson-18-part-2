package fatima;

import java.util.List;

public class Main {
    static void main(String[] args) {

        StudentService service = new StudentService();

        service.insertStudent(new Student(1, "Fatima", 3.8, List.of("Java", "SQL", "Math")));
        service.insertStudent(new Student(2, "Aygun", 3.2, List.of("Java", "English")));
        service.insertStudent(new Student(3, "Nergiz", 3.9, List.of("History", "Java")));

        System.out.println("ALL STUDENTS:");
        service.showAllStudents();

        System.out.println("\nSTUDENTS WITH GPA >= 3.5:");
        service.filterByGpa(3.5).forEach(System.out::println);


        System.out.println("\nSTUDENTS WHO HAVE JAVA:");
        service.findBySubject("Java").forEach(System.out::println);

        System.out.println("\nAFTER UPDATING SUBJECTS:");
        service.updateSubjects(1, List.of("Java", "Spring", "PostgreSQL"));

        service.showAllStudents();

        System.out.println("\nAFTER DELETING STUDENT WITH ID 2:");

        service.deleteStudentById(2);

        service.showAllStudents();
    }
}
