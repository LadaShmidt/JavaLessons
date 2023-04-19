package Streams;
import java.util.ArrayList;
import java.util.List;
/*
    Метод limit() позволяет ограничить количество элементов в потоке до заданного числа.
*/
public class Limit {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Отфилтруем четные числа в новый список, но ограничим количество таких элементов до 2
        list.stream().filter(element -> element % 2 == 0).limit(2).forEach(System.out::print);

    }
}
