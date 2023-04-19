package Collection.Queue.PriorityQueue;
/*
    PriorityQueue - это специальный вид очереди, в котором используется натуральная сортировка или та,
    которую мы описываем с помощью Comparable или Comparator. Таким образом используется тот элемент
    из очереди, приоритет которого выше, наивысший приоритет будет у наименьшего элемента.
*/
public class Student implements Comparable<Student>{
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
    public int compareTo(Student anotherStudent) {
        return age - anotherStudent.age;
    }
}
