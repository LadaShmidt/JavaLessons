package Streams;
import java.util.ArrayList;
import java.util.List;
/*
    Метод flatMap() в Java используется для преобразования каждого элемента потока,
    который является коллекцией или другим потоком, в отдельный элемент в выходном потоке.
    Другими словами, flatMap() принимает коллекцию (например, список) элементов и преобразует их в поток,
    который можно использовать дальше в цепочке операций потоков.
*/
public class FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Artem", 20);
        Student st2 = new Student("Masha", 22);
        Student st3 = new Student("Oleg", 18);
        Student st4 = new Student("Ivan", 25);

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Math");

        faculty1.addStudents(st1);
        faculty1.addStudents(st2);
        faculty2.addStudents(st3);
        faculty2.addStudents(st4);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);

/*
        С помощью метода flatMap() и вызове метода stream() на каждом элементе списка факультетов, мы из каждой коллекции списка факультетов
        образовали отельный стрим, таким образом мы получили доступ ко всем студентам и вывели их имена в консоль. 
*/
        facultyList.stream().flatMap(faculty -> faculty.getStudentList().stream()).forEach(element -> System.out.println(element.getName()));
    }
}
class Student{
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
}
class Faculty{
    String name;
    List<Student> studentList;
    Faculty(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public void addStudents(Student student) {
        studentList.add(student);
    }
}