package Multithreading.Volatile;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread myThread = new MyThread();

        myThread.start();

        Thread.sleep(3000);
        System.out.println("After 3 sec wake up!!!");

        System.out.println("End program");

        // Если b не будет volatile, поток main будет думать что b=true, а в кэше потока myThread b будет равна false
        myThread.b = false;
    }
}
