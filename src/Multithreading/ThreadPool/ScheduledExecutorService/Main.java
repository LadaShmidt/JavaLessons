package Multithreading.ThreadPool.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        // Создаем pool размером в один поток
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        // С помощью метода schedule устанавливаем расписание запуска потока
        // Task начнет выполняться спустя 3 секунды с момента запуска программы
        scheduledExecutorService.schedule(new MyRunnable(),3, TimeUnit.SECONDS);

        // С помощью метода scheduledAtFixedRate устанавливаем расписание запуска потока
        // Task начнет выполняться спустя 3 секунды и далее с периодичностью в 1 секунду
        // Между началом работы первой задачи и началом работы второй задачи пройдет период в 1 секунду
        scheduledExecutorService.scheduleAtFixedRate(new MyRunnable(), 3, 1, TimeUnit.SECONDS);

        // С помощью метода scheduledWithFixedDelay устанавливаем расписание запуска потока
        // Task начнет выполняться спустя 3 секунды и далее с периодичностью в 1 секунду
        // Между окончанием работы первой задачи и началом выполнения второй задачи пройдет период в 1 секунду
        scheduledExecutorService.scheduleWithFixedDelay(new MyRunnable(), 3, 1, TimeUnit.SECONDS);

        // Заставим поток main поспать 20 секунд чтобы наша программа могла выполняться это время
        Thread.sleep(20000);

        // Завершаем нашу программу
        scheduledExecutorService.shutdown();
    }
}
