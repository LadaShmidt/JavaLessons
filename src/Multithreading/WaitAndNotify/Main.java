package Multithreading.WaitAndNotify;
/*
    Для извещения потоком других потоков о своих действиях, используются методы wait() и notify().

    wait() освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор,
    пока другой поток не вызовет метод notify().

    notify() не освобождает монитор и будит поток, у которого ранее был вызван метод wait().

    notifyAll() не освобождает монитор и будит все потоки, у которых ранее был вызвон метод wait().
*/
public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread firstThread = new Thread(producer);
        Thread secondThread = new Thread(consumer);

        firstThread.start();
        secondThread.start();
    }
}
