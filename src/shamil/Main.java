import shamil.Student;
import shamil.StudentService;
import shamil.Subject;

import java.util.ArrayList;
import java.util.List;

void main() {

    List<Student> students = new ArrayList<>();

    students.add(new Student(
            1,
            "Ali",
            93.8,
            List.of(
                    new Subject("Java", 95),
                    new Subject("Math", 92),
                    new Subject("Database", 94)
            )
    ));

    students.add(new Student(
            2,
            "John",
            92.9,
            List.of(
                    new Subject("Java", 94),
                    new Subject("Physics", 91),
                    new Subject("English", 93)
            )
    ));

    students.add(new Student(
            3,
            "Sara",
            83.6,
            List.of(
                    new Subject("Math", 85),
                    new Subject("Java", 82),
                    new Subject("Algorithms", 84)
            )
    ));

    students.add(new Student(
            4,
            "David",
            82.5,
            List.of(
                    new Subject("English", 83),
                    new Subject("Physics", 82)
            )
    ));

    students.add(new Student(
            5,
            "Leyla",
            73.9,
            List.of(
                    new Subject("Java", 75),
                    new Subject("Database", 72),
                    new Subject("Algorithms", 74)
            )
    ));

    students.add(new Student(
            6,
            "Michael",
            73.2,
            List.of(
                    new Subject("Math", 74),
                    new Subject("Physics", 72),
                    new Subject("Java", 73)
            )
    ));

    students.add(new Student(
            7,
            "Aisha",
            72.7,
            List.of(
                    new Subject("English", 73),
                    new Subject("Database", 72)
            )
    ));

    students.add(new Student(
            8,
            "Daniel",
            83.5,
            List.of(
                    new Subject("Java", 85),
                    new Subject("Algorithms", 82),
                    new Subject("Physics", 84)
            )
    ));

    students.add(new Student(
            9,
            "Nigar",
            83.1,
            List.of(
                    new Subject("Math", 84),
                    new Subject("English", 82),
                    new Subject("Database", 83)
            )
    ));

    students.add(new Student(
            10,
            "Robert",
            92.4,
            List.of(
                    new Subject("Physics", 93),
                    new Subject("English", 91),
                    new Subject("Math", 93)
            )
    ));

    StudentService studentService = new StudentService(students);

    // 1. Showing all students
    studentService.showAllStudents();
    System.out.println();


    // 2. Inserting new student
    studentService.insertStudent(
            new Student(
                    11,
                    "John",
                    89.5,
                    List.of(
                            new Subject("Java", 90),
                            new Subject("Math", 88),
                            new Subject("Database", 91)
                    )
            )
    );

    studentService.showAllStudents();
    System.out.println();


    // 3. Deleting student by id
    studentService.deleteStudentById(3);

    studentService.showAllStudents();
    System.out.println();


    // 4. Updating subjects of student
    List<Subject> subjects = new ArrayList<>();

    subjects.add(new Subject("Java", 95));
    subjects.add(new Subject("Physics", 90));
    subjects.add(new Subject("English", 88));
    subjects.add(new Subject("Math", 92));

    studentService.updateSubjects(9, subjects);

    studentService.showAllStudents();
    System.out.println();


    // 5. Filtering students based on given GPA
    double score = 90;

    System.out.println("GPA >= 90:");
    System.out.println(studentService.filterByGpa(score));
    System.out.println();


    // 6. Finding students who have a given subject
    String subject = "Java";

    System.out.println("Students who study " + subject + ":");
    System.out.println(studentService.findBySubject(subject));
}