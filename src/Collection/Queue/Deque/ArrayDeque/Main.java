package Collection.Queue.Deque.ArrayDeque;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) {
       Student st1 = new Student("Max", 26, 4);
       Student st2 = new Student("Maria", 17, 3);
       Student st3 = new Student("Veronica", 15, 2);

        Deque<Student> dequeStudent = new ArrayDeque<>();

        // Метод addFirst(E e): добавляет элемент в начало очереди.
        dequeStudent.addFirst(st1);

        // Метод addLast(E e): добавляет элемент в конец очереди.
        dequeStudent.addLast(st2);

        // Метод offerFirst(E e): добавляет элемент в начало очереди, если это возможно, и возвращает true. Если очередь полна, метод возвращает false.
        dequeStudent.offerFirst(st3);

        // Метод offerLast(E e): добавляет элемент в конец очереди, если это возможно, и возвращает true. Если очередь полна, метод возвращает false.
        dequeStudent.offerLast(st1);

        // Метод removeFirst(): удаляет и возвращает первый элемент очереди. Если очередь пуста, метод генерирует исключение NoSuchElementException.
        dequeStudent.removeFirst();

        // Метод removeLast(): удаляет и возвращает последний элемент очереди. Если очередь пуста, метод генерирует исключение NoSuchElementException.
        dequeStudent.removeLast();

        // Метод pollFirst(): удаляет и возвращает первый элемент очереди. Если очередь пуста, метод возвращает null.
        dequeStudent.pollFirst();

        // Метод pollLast(): удаляет и возвращает последний элемент очереди. Если очередь пуста, метод возвращает null.
        dequeStudent.pollLast();

        // Метод getFirst(): возвращает первый элемент очереди, но не удаляет его. Если очередь пуста, метод генерирует исключение NoSuchElementException.
        dequeStudent.getFirst();

        // Метод getLast(): возвращает последний элемент очереди, но не удаляет его. Если очередь пуста, метод генерирует исключение NoSuchElementException.
        dequeStudent.getLast();

        // Метод peekFirst(): возвращает первый элемент очереди, но не удаляет его. Если очередь пуста, метод возвращает null.
        dequeStudent.peekFirst();

        // Метод peekLast(): возвращает последний элемент очереди, но не удаляет его. Если очередь пуста, метод возвращает null.
        dequeStudent.peekLast();
    }
}
