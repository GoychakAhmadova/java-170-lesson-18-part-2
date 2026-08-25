package lesson18part2;

import java.util.ArrayList;
import java.util.List;


public class StudentService {
    static void main() {

    }
    List<Student> students = new ArrayList<>();

    public void showAllStudents() {
        for(Student student: students){
            System.out.println(student);
        }
    }
    public void insertStudents() {
        students.add(new Student(85,
                4,
                "Ali",
                List.of("Java", "SQL", "Math")));
    }

//    public void deleteStudent(){
//        students.remove(students);
//    }

}
