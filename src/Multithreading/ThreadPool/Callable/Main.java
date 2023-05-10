package Multithreading.ThreadPool.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static int factorialResult;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        MyCallable myCallable = new MyCallable(6);

        // Метод submit() принимает в thread pool наш task и возвращает результат этого task
        // Результат нашего task хранится в объекте типа Future
        Future<Integer> future = executorService.submit(myCallable);

        // Метод get() класса Future возвращает результат task
        try{
            factorialResult = future.get();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        catch(ExecutionException e) {
            // Таким образом, ExecutionException сообщает о том, что задача не была выполнена успешно из-за возникшего исключения.
            // Метод getCause() возвращает причину выброса exception
            System.out.println(e.getCause());
        }
        // Хорошей практикой является останавливать работу ExecutorService в finally blocks
        finally{
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}
