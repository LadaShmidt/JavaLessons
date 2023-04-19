package Multithreading.DeadLock;

public class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("First Thread: попытка захватить монитор объекта First Lock");
        synchronized(DeadLock.firstLock) {
            System.out.println("First Thread: монитор объекта First Lock захвачен");
            System.out.println("First Thread: попытка захватить монитор объекта Second Lock");
            synchronized(DeadLock.secondLock) {
                System.out.println("First Thread: монитор объекта Second Lock захвачен");
            }
        }
    }
}
