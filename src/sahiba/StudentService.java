package sahiba;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;


public class StudentService {
    public StudentService() {
    }
    public static void main(String[] args) {
    }
    List<Student> students = new ArrayList<>();

    public void insertStudent(Student student){
        students.add(student);
    }
    public void showAllStudents() {
        //для того чтобы вывести каждого студента по очереди нужен цикл
        for(Student student: students){
            System.out.println(student);
        }
    }

    public void deleteStudent(int id){
        for(int i=0; i< students.size(); i++){
            if(students.get(i).getId()==id){
                students.remove(i);
                break;
            }
        }
    }
// передаем параметр в скобки по которому достигнем студента, то есть мы в классе main укажем id и список
    public void updateList(int id, List<String> subjects){
        for(int i=0; i<students.size(); i++){
            //сначала получаем инедс студента и соотвественно индексу id и проверяем совпадает
            //ли это id с id которогг мы введем в main
            if(students.get(i).getId()==id) {
                // Заменяем текущий список предметов найденного студента на новый
                //благодаря параметрам в скобке в начале мы в main укажем id и новый список subjects
               students.get(i).setSubject(subjects);
            }
        }
    }
}

