package Streams;

import java.util.ArrayList;
import java.util.List;

/*
    Методы min() и max() используются для получения минимального и максимального элемента потока соответственно.
*/
public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Найдем максимальное значение списка list и запишем его в переменную max
        Integer max = list.stream().max((x, y) -> x.compareTo(y)).orElse(0);

        // Найдем минимальное значение списка list и запишем его в переменную min
        Integer min = list.stream().min((x, y) -> x.compareTo(y)).orElse(0);

        System.out.println("Max: " + max + " Min: " + min);
    }
}
