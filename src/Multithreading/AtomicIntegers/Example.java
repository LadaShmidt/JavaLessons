package Multithreading.AtomicIntegers;
import java.util.concurrent.atomic.AtomicInteger;

/*
    AtomicInteger - это класс, который предоставляет возможность работать с целочисленным значением int,
    используя атомарные операции.
    Атомарная операция - это операция, которая выполняется полностью или не выполняется совсем,
    несмотря на то, что происходит в других потоках или процессах в системе.
    Она является неделимой, то есть не может быть разделена на более мелкие части,
    и либо выполняется полностью, либо не выполняется вообще.
*/
public class Example implements Runnable{
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        counter.incrementAndGet();
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            Example.increment();
        }
    }
}