package Multithreading.WaitAndNotify;

public class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while(breadCount < 1) {
            try {
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Consumer buy 1 bread");
        System.out.println("Count of bread in market: " + breadCount);
        notify();
    }

    public synchronized void putBread() {
        while(breadCount == 5) {
            try {
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Producer make 1 bread");
        System.out.println("Count of bread in market: " + breadCount);
        notify();
    }
}
