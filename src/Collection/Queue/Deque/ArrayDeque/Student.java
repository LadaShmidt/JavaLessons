package Collection.Queue.Deque.ArrayDeque;
/*
    Класс ArrayDeque представляет собой двустороннюю очередь, реализованную в виде массива.
    Он позволяет добавлять и удалять элементы с обоих концов очереди.
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
}
