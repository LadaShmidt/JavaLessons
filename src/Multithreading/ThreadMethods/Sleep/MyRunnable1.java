package Multithreading.ThreadMethods.Sleep;
/*
    Метод sleep(long millis) относится к классу Thread
    и позволяет приостановить выполнение текущего потока на определенное количество миллисекунд.

    Время задается параметром millis,
    который указывает количество миллисекунд, на которое нужно приостановить выполнение потока.
    Метод sleep() может выбрасывать InterruptedException, если в процессе ожидания поток был прерван.
*/
public class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            // Так как метод sleep() выбрасывает InterruptedException, необходимо обернуть его в try и catch
            try {
                Thread.sleep(1000);
            }
            // InterruptedException выбросится тогда, когда другой поток попросит наш поток остановится в момент спячки
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            // Метод currentThread возвращает текущий поток
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
