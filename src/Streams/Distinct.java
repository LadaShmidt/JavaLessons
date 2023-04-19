package Streams;
import java.util.stream.Stream;

/*
    Метод distinct() в Java используется для удаления повторяющихся элементов из потока.
    Он возвращает новый поток, который содержит только уникальные элементы из исходного потока.
*/
public class Distinct {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,2,3,4,4,5);
        stream.distinct().forEach(System.out::print);
    }
}
