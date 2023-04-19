package Streams;
import java.util.Arrays;
import java.util.List;

/*
    Метод forEach() используется для выполнения заданного действия на каждом элементе потока.
    Этот метод не возвращает никаких значений и не изменяет исходный поток данных.
*/
public class ForEach {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        integerList.stream().forEach(element -> System.out.print(element));
    }
}
