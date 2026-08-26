package sahiba;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Создаём объекты Student
        Student student1 = new Student(90, 1, "Lana", List.of("Math", "Chemistry"));
        Student student2 = new Student(91, 2, "Raya", List.of("Math", "Chemistry"));
        Student student3 = new Student(87, 3, "Saya", List.of("Math", "Chemistry, Physics"));
        Student student4 = new Student(95, 4, "Noi", List.of("Math", "Chemistry, QA"));
// Создаём объект StudentService для работы со списком студентов
        StudentService studentService= new StudentService();
// Добавляем созданных студентов в список
        studentService.insertStudent(student1);
        studentService.insertStudent(student2);
        studentService.insertStudent(student3);
        studentService.insertStudent(student4);
        //используем методы в мэйн
        System.out.println("The list of all students: ");
        studentService.showAllStudents();
        studentService.deleteStudent(1);
        System.out.println();
        System.out.println("After removing the student (id=1): ");
        studentService.showAllStudents();
        System.out.println();
        System.out.println("After updating the list of subjects (id=4): ");
        studentService.updateList(4, List.of("Sql", "Qa", "Data Analytics"));
        studentService.showAllStudents();

    }
}