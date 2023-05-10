package Multithreading.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/*
    ArrayBlockingQueue это потокобезопасная очередь с ограниченным размером (capacity restricted).

    Обычно один или несколько потоков добавляют элементы в конец очереди, а другой или другие потоки забирают элементы из начала очереди.
*/
public class Main {
    public static void main(String[] args) {
        // При инициализации ArrayBlockingQueue в скобках необходимо указывать размер очереди
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // При попытке добавить пятый элемент в очередь с размером 4, выбросится exception
        // queue.add(5);

        // Однако мы можем попробоваьт добавить его с помощью метода offer() и exception выброшен не будет, но и элемент добавлен не будет
        queue.offer(5);

        System.out.println(queue);
    }
}
