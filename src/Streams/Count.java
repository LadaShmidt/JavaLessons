package Streams;
import java.util.List;
import java.util.stream.Stream;

/*
    Метод count() используется для подсчета количества элементов в потоке.
    Он возвращает количество элементов в потоке в виде значения типа long.
    Метод count() не изменяет исходный поток, а просто возвращает его размер.
*/
public class Count {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World", "Bye");

        System.out.println(stream.count());
    }
}
