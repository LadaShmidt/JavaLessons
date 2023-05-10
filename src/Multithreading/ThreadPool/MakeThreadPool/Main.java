package Multithreading.ThreadPool.MakeThreadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
    Thread pool - это множество потоков, каждый из которых предназначен для выполнения той или иной задачи.

    C thread pool удобнее всего работать посредством интерфейса ExecutorService.

    Thread pool удобнее всего создавать, используя factory методы класса Executors:

    Executors.newFixedThreadPool(int count) - создаст pool n количеством потоков.
    Executors.newSingleThreadExecutor() - создаст pool с одним потоком.
*/
public class Main {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        // Метод execute передает наше задание (task) в thread pool, где оно выполняется одним из потоков.
        for(int i = 0; i < 10; i++) {
            executorService1.execute(new MyRunnable());
            executorService2.execute(new MyRunnable());
        }
        // Метод shutdown() завершает работу ExecutorService, без него наш thread pool будет бесконечно ожидать новых заданий
        executorService1.shutdown();

/*
        Метод awaitTermination принуждает поток в котором он вызывался подождать до тех пор,
        пока не выполнится одно из двух событий:

        Либо ExecutorService завершит свою работу.
        Либо пройдет время, указанное в параметре метода awaitTermination.
*/
        executorService1.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Main ends");
    }
}
