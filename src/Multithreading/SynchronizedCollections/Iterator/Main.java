package Multithreading.SynchronizedCollections.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        List<Integer> synchList = Collections.synchronizedList(list);

        Runnable firstRunnable = () -> {
            Iterator<Integer> iterator = synchList.iterator();

            // Для избежания ConcurrentModificationException, работу Iterator всегда необходимо заключать в блок synchronized
            synchronized(synchList){
                while(iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable secondRunnable = () -> {
            synchList.remove(10);
        };

        Thread firstThread = new Thread(firstRunnable);
        Thread secondThread = new Thread(secondRunnable);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(synchList);
    }
}
