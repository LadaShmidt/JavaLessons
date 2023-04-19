package Multithreading.Lock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Lock lock = new ReentrantLock();

        Employee emp1 = new Employee("Maxim", lock);
        Employee emp2 = new Employee("Sergey", lock);
        Employee emp3 = new Employee("Bob", lock);

        Thread.sleep(5000);

        Employee emp4 = new Employee("George", lock);
        Employee emp5 = new Employee("Ivan", lock);
    }
}
