package Multithreading.SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Integer> source = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            source.add(i);
        }

        // Создаем синхронизированный список
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> {synchronizedList.addAll(source);};

        Thread firstThread = new Thread(runnable);
        Thread secondThread = new Thread(runnable);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(synchronizedList);
    }
}
