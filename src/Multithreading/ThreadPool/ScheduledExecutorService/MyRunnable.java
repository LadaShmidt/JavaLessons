package Multithreading.ThreadPool.ScheduledExecutorService;
/*
    ScheduledExecutorService используется для установления расписания запуска потоков и пула.

    Данный pool создается, используя factory метод класса Executors:
    Executors.newScheduledThreadPool(int count);
*/
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
