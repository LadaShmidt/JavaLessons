package Multithreading.ThreadMethods.Priority;
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        // Варианты установления приоритетов, помимо int значение от 1 до 10
        myThread.setPriority(10);

        myThread.setPriority(Thread.MIN_PRIORITY);   // MIN_PRIORITY = 1
        myThread.setPriority(Thread.NORM_PRIORITY); // NORM_PRIORITY = 5
        myThread.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10

        System.out.println("Priority of Thread: " + myThread.getPriority());
    }
}
