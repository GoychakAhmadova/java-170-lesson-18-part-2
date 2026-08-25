package kanan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        Student student = new Student("12345", "Kanan", 3.6, Arrays.asList("IT", "Calculus-1", "Linear Algebra"));
        Student student2 = new Student("12342", "Sahil", 3.1, Arrays.asList("History", "Geography", "Math"));
        Student student3 = new Student("12321", "Shamil", 2.9, Arrays.asList("Calculus-2", "English", "IT") );
        Student student4= new Student("43232", "Reshad", 4.0, Arrays.asList("Calculus-3", "English", "Computer Graphics"));
        List<Student> students = new ArrayList<>(Arrays.asList(student, student2, student3, student4));
        showStudents(students);

        Student newStudent = new Student("54321", "Abbas", 4.3,  Arrays.asList("IT", "Calculus-1", "Linear Algebra"));


        insertStudent(students, newStudent);
        showStudents(students);

        deleteStudentById(students, "12321");
        showStudents(students);

        updateStudentSubjects(students, "12345", Arrays.asList("Computer Architecture", "Calculus-2", "Data Science"));
        showStudents(students);

        List<Student> filteredStudents = students.stream().filter(student1 -> student.getGpa() > 3.0).collect(Collectors.toList());
        System.out.println("Filtered students: " + filteredStudents);

    }
    public static void showStudents(List<Student> students){
        System.out.println("--------All students--------");
        for (Student s : students) {
            System.out.println(s);
        }
    }


    public static void insertStudent(List<Student> studentList, Student newStudent) {
        studentList.add(newStudent);
        System.out.println("Successfully inserted student: " + newStudent.getName());
    }

    public static void deleteStudentById(List<Student> studentList, String targetId) {
        boolean removed = studentList.removeIf(student -> student.getId().equals(targetId));

        if (removed) {
            System.out.println("Successfully deleted student with ID: " + targetId);
        } else {
            System.out.println("Student with ID " + targetId + " not found.");
        }
    }

    public static void updateStudentSubjects(List<Student> studentList, String targetId, List<String> newSubjects) {
        boolean found = false;

        for (Student student : studentList) {
            if (student.getId().equals(targetId)) {
                student.setSubjects(newSubjects);
                System.out.println("Successfully updated subjects for " + student.getName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + targetId + " not found. Cannot update subjects.");
        }
    }


}
