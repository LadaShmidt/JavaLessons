package Streams;
import java.util.ArrayList;
import java.util.List;

/*
    Метод findFirst() используется для получения первого элемента потока.
*/
public class FindFirst {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer number = list.stream().findFirst().orElse(0);
        System.out.println(number);
    }
}
