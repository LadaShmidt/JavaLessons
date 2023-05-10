package Multithreading.CountDownLatch;
import java.util.concurrent.CountDownLatch;
public class Buyer extends Thread{
    String name;
    private CountDownLatch countDownLatch;
    Buyer(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    @Override
    public void run(){
        try{
            // Если счетчик countDownLatch > 0, наш поток будет заблокирован до тех пор пока счетчик не станет = 0
            countDownLatch.await();
            System.out.println(name + " приступил к закупкам");
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
