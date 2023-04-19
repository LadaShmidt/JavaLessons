package Multithreading.Daemon;
public class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());

        for(int i = 1; i <= 1000; i++) {
            try {
                sleep(1000);
                System.out.println(i);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
