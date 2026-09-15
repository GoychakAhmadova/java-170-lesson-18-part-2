package sahiba;

import java.util.List;

public class Main {
         static void main()  {

// Создаём объекты Student
        Student student1 = new Student(90, 1, "Lana", List.of("Math", "Chemistry"));
        Student student2 = new Student(92, 2, "Raya", List.of("Math", "Chemistry","C++"));
        Student student3 = new Student(85, 3, "Saya", List.of("Anatomy", "Python" , "Physics"));
        Student student4 = new Student(95, 4, "Noi", List.of("Math", "Data Analytics" , "QA"));
        Student student5 = new Student(89, 5, "Simon", List.of("Java", "Chemistry" , "QA"));
        Student student6 = new Student(92, 6, "Leyla", List.of("Java", "Biology" , "Physics"));
        Student student7 = new Student(98, 7, "Patrick", List.of("Java", "C++" , "C#"));
        Student student8 = new Student(100, 8, "Anna", List.of("Math", "Data Analytics" , "QA"));
// Создаём объект StudentService для работы со списком студентов
        StudentService studentService= new StudentService();
// Добавляем созданных студентов в список
        studentService.insertStudent(student1);
        studentService.insertStudent(student2);
        studentService.insertStudent(student3);
        studentService.insertStudent(student4);
        studentService.insertStudent(student5);
        studentService.insertStudent(student6);
        studentService.insertStudent(student7);
        studentService.insertStudent(student8);
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
        System.out.println();
        System.out.println("The FILTERED list of students who has GPA >= 90");
//      вывод на консоль списка так чтоб он был построчно предстаилен:
        studentService.filterByGpa(90).forEach(System.out::println);
        System.out.println();
        System.out.println("The FILTERED list of students what contains Math");
//       вывод на консоль списка так чтоб он был построчно предстаилен:
        studentService.filterBySubjects("Math").forEach(System.out::println);

        }
}