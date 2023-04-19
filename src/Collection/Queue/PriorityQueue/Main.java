package Collection.Queue.PriorityQueue;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Max", 26, 4);
        Student st2 = new Student("Maria", 17, 3);
        Student st3 = new Student("Veronica", 15, 2);

        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>();
        studentPriorityQueue.add(st1);
        studentPriorityQueue.add(st2);
        studentPriorityQueue.add(st3);

        for(int i = 0; i < 3; i++) {
            System.out.println(studentPriorityQueue.peek());
            studentPriorityQueue.poll();
        }
    }
}
