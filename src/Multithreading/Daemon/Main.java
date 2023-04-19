package Multithreading.Daemon;
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        UserThread userThread = new UserThread();
        userThread.setName("UserThread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("DaemonThread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ends");
    }
}
