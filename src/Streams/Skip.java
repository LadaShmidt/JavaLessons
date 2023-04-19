package Streams;

import java.util.ArrayList;
import java.util.List;

/*
    В метод skip() позволяет пропустить заданное количество элементов в потоке данных и вернуть оставшиеся элементы.
*/
public class Skip {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Пропустим первые 3 элемента списка и выведем в консоль что осталось
        list.stream().skip(3).forEach(System.out::print);
    }
}
