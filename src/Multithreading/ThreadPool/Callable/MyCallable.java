package Multithreading.ThreadPool.Callable;
import java.util.concurrent.Callable;
/*
    Callable - это функциональный интерфейс, который позволяет определить задачу,
    которая может вернуть результат и может генерировать исключение.

    Callable похож на интерфейс Runnable, который также используется для определения задач в многопоточных приложениях.
    Однако, в отличие от Runnable, Callable может возвращать значение, которое может быть использовано другими потоками в приложении.
*/
public class MyCallable implements Callable<Integer> {
    int factorial;

    MyCallable(int factorial) {
        this.factorial = factorial;
    }

    // Перезапишем метод call() таким образом, чтобы он возвращал факториал любого положительного, целого числа
    // И выбрасывал Exception если число равно или меньше нуля
    @Override
    public Integer call() throws Exception {
        if(factorial <= 0) {
            throw new Exception("Illegal integer!!!");
        }
        int result = 1;
        for(int i = 1; i <=factorial; i++){
            result *= i;
        }
        return result;
    }
}
