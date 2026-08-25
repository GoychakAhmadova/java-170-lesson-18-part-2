import shamil.Student;
import shamil.StudentService;

void main() {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Ali", 93.8, List.of("Java", "Math", "Database")),
            new Student(2, "John", 92.9, List.of("Java", "Physics", "English")),
            new Student(3, "Sara", 83.6, List.of("Math", "Java", "Algorithms")),
            new Student(4, "David", 82.5, List.of("English", "Physics")),
            new Student(5, "Leyla", 73.9, List.of("Java", "Database", "Algorithms")),
            new Student(6, "Michael", 73.2, List.of("Math", "Physics", "Java")),
            new Student(7, "Aisha", 72.7, List.of("English", "Database")),
            new Student(8, "Daniel", 83.5, List.of("Java", "Algorithms", "Physics")),
            new Student(9, "Nigar", 83.1, List.of("Math", "English", "Database")),
            new Student(10, "Robert", 92.4, List.of("Physics", "English", "Math"))
            )
    );

    StudentService studentService = new StudentService(students);

    //1. Showing all students
    studentService.showAllStudents();
    System.out.println();

    //2. Inserting new student
    studentService.insertStudent(
            new Student(
                    11, "John", 3.8, List.of("Java", "Math", "Database")
            )
    );
    studentService.showAllStudents();
    System.out.println();

    //3. Deleting student by id
    studentService.deleteStudentById(3);
    System.out.println();

    //4. Updating subjects of student
    List<String> subjects = List.of("Java", "Physics", "English", "Math");
    studentService.updateSubjects(9,subjects);
    System.out.println();

    //create lambdas
    //1. Filtering students based on given gpa (score)
    int score = 90;
    System.out.println("GPA>90");
    System.out.println(studentService.filterByGpa(score));
    System.out.println();

    //2. Finding students who has given subject
    String subject = "Java";
    System.out.println(studentService.findBySubject(subject));
    System.out.println();



}
