package Multithreading.ConcurrentCollections.ConcurentHasMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*

 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1,"Pit");
        map.put(2,"Bob");
        map.put(3,"Loly");
        map.put(4,"Rosy");
        System.out.println(map);
        Runnable firstRunnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        };
        Runnable secondRunnable = () -> {
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            map.put(4, "Pit");
        };
        Thread firstThread = new Thread(firstRunnable);
        Thread secondThread = new Thread(secondRunnable);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
    }
}
