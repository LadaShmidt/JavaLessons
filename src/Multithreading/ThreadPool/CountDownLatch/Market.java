package Multithreading.ThreadPool.CountDownLatch;
import Streams.Count;

import java.util.concurrent.CountDownLatch;
/*
    CountDownLatch - это синхронизатор, позволяющий любому количеству потоков ждать пока не завершится определенное количество операций.
    В конструктор CountDownLatch нужно передавать количество операций, которые должны завершиться, чтобы потоки продолжили свою работу.
*/
public class Market {
    private CountDownLatch countDownLatch;
    Market(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    void marketStaffIsOnPlace() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        // Уменьшаем счетчик на 1
        countDownLatch.countDown();
        // Метод getCount() возвращает текущее значение счетчика
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    void everythingIsReady() throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        // Уменьшаем счетчик на 1
        countDownLatch.countDown();
        // Метод getCount() возвращает текущее значение счетчика
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    void openMarket() throws InterruptedException{
        Thread.sleep(4000);
        System.out.println("Market is open");
        // Уменьшаем счетчик на 1
        countDownLatch.countDown();
        // Метод getCount() возвращает текущее значение счетчика
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
}
