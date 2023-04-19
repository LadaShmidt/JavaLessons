package Multithreading.ThreadMethods.Sleep;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new MyRunnable1());
        Thread secondThread = new Thread(new MyRunnable2());

        firstThread.start();
        secondThread.start();

        // Этот вывод сработает до того, как начнут свою работу наши потоки, потому что метод main не спит
        System.out.println("END");
    }
}
