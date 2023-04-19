package Streams;
import java.util.ArrayList;
import java.util.List;

/*
    Метод reduce выполняет терминальные операции сведения, возвращая некоторое значение - результат операции.
*/
public class Reduce {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(1);
        integerList.add(3);
        integerList.add(8);

        int result = integerList.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Bye");

        String temp = stringList.stream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(temp);
    }
}
