package Multithreading.ThreadPool.Semaphore;
import java.util.concurrent.Semaphore;
/*
    Semaphore - это синхронизатор, позволяющий ограничить доступ к какому-то ресурсу.
    В конструктор Semaphore нужно передавать количество потоков,
    которым Semaphore будет разрешать одновременного использовать этот ресурс.
*/
public class Person extends Thread{
    String name;
    private Semaphore callBox;
    Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    @Override
    public void run() {
        try{
            System.out.println(name + " wait");
            // Метод acquire() пытается получить разрешение на использование ресурса от Semaphore
            callBox.acquire();
            System.out.println(name + " use a phone");
            sleep(2000);
            System.out.println(name + " quit call");
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            // Метод release() освобождает разрешение Semaphore и его counter увеличивается на 1
            callBox.release();
        }
    }
}
