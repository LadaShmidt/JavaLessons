package Multithreading.MakeThread.FirstMethod;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        // Для запуска потока всегда необходимо использовать метод start(), метод run() не запустит поток и будет находится в потоке main
        myThread1.start();
        myThread2.start();
    }
}

