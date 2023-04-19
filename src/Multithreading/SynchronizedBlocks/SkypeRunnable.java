package Multithreading.SynchronizedBlocks;

public class SkypeRunnable implements Runnable {
    @Override
    public void run() {
        new Calling().skypeCall();
    }
}
