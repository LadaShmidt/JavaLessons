package Multithreading.ThreadMethods.Name;
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        System.out.println("Name of Thread before naming: " + myThread.getName());
        myThread.setName("First Thread");
        System.out.println("Name of Thread after naming: " + myThread.getName());
    }
}
