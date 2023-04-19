package Multithreading.SynchronizedBlocks;

public class MobileRunnable implements Runnable{
    @Override
    public void run() {
        new Calling().mobileCall();
    }
}
