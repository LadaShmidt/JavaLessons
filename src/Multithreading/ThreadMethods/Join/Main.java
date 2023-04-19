package Multithreading.ThreadMethods.Join;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread myThread = new MyThread();

        myThread.start();
        myThread.join();

        // Этот вывод сработает после того, как начнут свою работу наши потоки, потому что мы применили метод join()
        System.out.println("LET'S GO!!!");

        // Метод getState() возвращает состояние потока (new, runnable, terminated)
        System.out.println(myThread.getState());
    }
}
