package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
    Метод peek() используется для выполнения какой-либо операции над каждым элементом потока без изменения самих элементов.
    Он не изменяет исходный поток, но возвращает новый поток, который содержит те же элементы, что и исходный.
    Метод peek() может использоваться для отладки, тестирования и логирования операций на элементах потока.
*/
public class Peek {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Stream<Integer> stream = Stream.of(1,2,3,3,4,5,5,6);
        list = stream.distinct().peek(System.out::print).collect(Collectors.toList());
    }
}
