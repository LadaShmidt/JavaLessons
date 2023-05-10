package Multithreading.Interruption;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");

        MyThread myThread = new MyThread();

        myThread.start();
        Thread.sleep(1000);
        myThread.interrupt();
        myThread.join();

        System.out.println("Main ends");
    }
}
