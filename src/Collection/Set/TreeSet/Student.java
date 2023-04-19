package Collection.Set.TreeSet;
import java.util.Objects;
/*
    TreeSet в Java является реализацией интерфейса Set, который поддерживает хранение элементов
    в отсортированном порядке в соответствии с естественным порядком элементов или заданному компаратору.

    Когда вы создаете TreeSet, вы можете задать естественный порядок элементов
    или определить собственный компаратор, который будет определять порядок элементов в наборе.

    Это позволяет TreeSet эффективно поддерживать операции вставки, удаления и поиска элементов в отсортированном порядке.
*/
public class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;
    Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    // Если a.equals(b) = true, тогда a.compareTo(b) должно быть равным 0.
    @Override
    public int compareTo(Student anotherStudent) {
        return this.course - anotherStudent.course;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return course == student.course;
    }
    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
    @Override
    public String toString() {
        return name + " " + surname + " " + course;
    }
}
