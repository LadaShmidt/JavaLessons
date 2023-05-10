package Multithreading.CopyOnWriteArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
    CopyOnWriteArrayList имплементирует интерфейс List.
    CopyOnWriteArrayList следует использовать использовать тогда, когда нужно добиться потокобезопасности
    при условии небольшого количества операций по изменению элементов и большое количество по их чтению.
*/
public class Main {
    public static void main(String[] args) throws InterruptedException{
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Sergey");
        list.add("Lada");
        list.add("Bob");
        list.add("Maria");
        list.add("George");
        System.out.println(list);

        Runnable firstRunnable = () -> {
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()) {
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable secondRunnable = () -> {
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Elena");
        };

        Thread firstThread = new Thread(firstRunnable);
        Thread secondThread = new Thread(secondRunnable);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(list);
    }
}
