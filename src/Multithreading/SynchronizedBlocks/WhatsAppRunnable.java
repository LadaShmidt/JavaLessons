package Multithreading.SynchronizedBlocks;

public class WhatsAppRunnable implements Runnable {
    @Override
    public void run() {
        new Calling().whatsAppCall();
    }
}
