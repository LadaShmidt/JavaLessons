package Collection.Queue.Deque.LinkedList;

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
