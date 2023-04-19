package Collection.Queue.Deque.LinkedList;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Bob",20, 1);
        Student st2 = new Student("Bill", 16, 2);

        // Элементы в очередь добавляеются offer/add в конец очереди и удаляются poll/remove из конца очереди
        Queue<Student> queue = new LinkedList<>();

        // Когда очередь переполнена, добавление через add() вызовет exception
        queue.add(st1);

        // Когда очередь переполнена, добавление элемента через offer() не вызовет exception
        queue.offer(st2);

        // Когда элементы закончатся, удаление через remove() вызовет exception
        queue.remove();

        // Когда элементы закончатся, удаление через poll() не вызовет exception
        queue.poll();

        // Когда элементы в очереди закончатся, метод element() возвращающий первый элемент вызовет exception
        queue.element();

        // Когда элементы в очереди закончатся, метод peek() возвращающий первый элемент не вызовет exception
        queue.peek();
    }
}
