package Multithreading.AtomicIntegers;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread firstThread = new Thread(new Example());
        Thread secondThread = new Thread(new Example());

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(Example.counter);
    }
}