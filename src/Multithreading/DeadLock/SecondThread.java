package Multithreading.DeadLock;

public class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("Second Thread: попытка захватить монитор объекта Second Lock");
        synchronized(DeadLock.secondLock) {
            System.out.println("Second Thread: монитор объекта Second Lock захвачен");
            System.out.println("Second Thread: попытка захватить монитор объекта First Lock");
            synchronized(DeadLock.firstLock) {
                System.out.println("SecondThread: монитор объекта First Lock захвачен");
            }
        }
    }
}
