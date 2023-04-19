package Multithreading.Synchronized;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread myThread = new MyThread();

        Thread firstThread = new Thread(myThread);
        Thread secondThread = new Thread(myThread);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(MyThread.counter);
    }
}
