package Multithreading.ThreadPool.Semaphore;
import java.util.concurrent.Semaphore;
public class Main {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        Person Sergey = new Person("Sergey", callBox);
        Person Lada = new Person("Lada", callBox);
        Person Bob = new Person("Bob", callBox);
        Person Jack = new Person("Jack", callBox);
        Person Maria = new Person("Maria", callBox);
    }
}
