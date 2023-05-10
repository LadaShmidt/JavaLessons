package Multithreading.Daemon;
/*
    Daemon потоки предназначены для выполнения фоновых задач и оказания различных сервисов User потокам.

    При завершении работы последнего User потока программа завершает свое выполнение,
    не дожидаясь окончания работы Daemon потоков.

    Для создания daemon потока необходимо после создания обычного потока вызвать на потоке метод setDaemon()
    Для того, чтобы проверить является ли поток daemon, необходимо на потоке вызвать метод isDaemon()
*/
public class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());

        for(char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
