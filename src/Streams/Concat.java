package Streams;
import java.util.stream.Stream;

/*
    Метод concat() используется для объединения двух строк. Он возвращает новую строку,
    которая представляет собой результат объединения исходной строки и переданной строки в качестве аргумента.
*/
public class Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::print);
    }
}
