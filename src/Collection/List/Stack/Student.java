package Collection.List.Stack;
/*
 Stack - это класс в Java, который представляет стек, т.е. коллекцию элементов,
 которые добавляются и удаляются в соответствии с принципом "последний вошел - первый вышел" (LIFO - last-in, first-out).
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
