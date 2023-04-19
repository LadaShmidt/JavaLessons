package Multithreading.Lock;
import java.util.concurrent.locks.Lock;
/*

*/
public class Employee extends Thread{
    private String name;
    private Lock lock;
    Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    @Override
    public void run() {
        if(lock.tryLock()) {
            try{
                System.out.println(name + " wait...");
                //lock.lock();
                System.out.println(name + " use ATM");
                Thread.sleep(2000);
                System.out.println(name + " quit his business");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " don't wants to wait");
        }
    }
}
