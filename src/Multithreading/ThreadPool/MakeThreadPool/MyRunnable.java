package Multithreading.ThreadPool.MakeThreadPool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
