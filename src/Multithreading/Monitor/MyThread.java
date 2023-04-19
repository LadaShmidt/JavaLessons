package Multithreading.Monitor;
/*
    Монитор - это сущность/механизм, благодаря которому достигается корректная работа при синхронизации.
    У каждого объекта и класса есть привязанный к нему монитор.
*/
public class MyThread extends Thread {
    volatile static int counter = 0;

    // Если синхронизированный метод статический, по умолчанию будет использован монитор всего класса, а не отдельного экземпляра
    public static synchronized void decrement() {
        counter--;
    }

    // Если синхронизированный метод не статический, по умолчанию будет использован монитор экземпляра текущего класса (this)
    public synchronized void showCounter() {
        System.out.println(counter);
    }

    // Либо мы можем явно указать объект или класс, монитор которого хотим задействовать
    public void increment() {
        synchronized(this) {
            counter++;
        }
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            increment();
        }
    }
}
