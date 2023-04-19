package Multithreading.LambdaMethod;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello")).start();
    }
}
