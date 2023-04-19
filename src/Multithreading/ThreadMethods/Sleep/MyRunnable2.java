package Multithreading.ThreadMethods.Sleep;
public class MyRunnable2 implements Runnable {
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
