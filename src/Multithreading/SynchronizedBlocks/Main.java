package Multithreading.SynchronizedBlocks;
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MobileRunnable());
        Thread thread2 = new Thread(new SkypeRunnable());
        Thread thread3 = new Thread(new WhatsAppRunnable());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
