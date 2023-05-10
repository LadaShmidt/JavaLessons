package Multithreading.ThreadPool.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i =0; i < 1000; i++){
            integers.add(i);
        }
        List<Integer>integerList = Collections.synchronizedList(integers);
        Runnable firstRunnable = () -> {
            Iterator<Integer> integerIterator = integers.iterator();
            synchronized (integerList){
                while(integerIterator.hasNext()){
                    System.out.println(integerIterator.next());
                }
            }
        };
        Runnable secondRunnable = () -> {
            integerList.remove(10);
        };
        Thread firstThread = new Thread(firstRunnable);
        Thread secondThread = new Thread(secondRunnable);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
    }
}
