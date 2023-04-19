package Multithreading.MakeThread.SecondMethod;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);

        // Для запуска потока всегда необходимо использовать метод start(), метод run() не запустит поток и будет находится в потоке main
        thread1.start();
        thread2.start();
    }
}
