package Collection.Set.HashSet;

import java.util.Objects;

/*
    HashSet – это коллекция, которая для хранения элементов внутри использует их хэш-значения, которые возвращает метод hashCode().
    Для простоты внутри HashSet<E> хранится объект HashMap<E, Object>, который и хранит в качестве ключей значения HashSet.
*/
public class Student {
    String name;
    int age;
    int course;

    Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course);
    }
}
