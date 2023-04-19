package Streams;
import java.util.ArrayList;
import java.util.List;

/*
    parallelStream - это расширение класса Stream, которое позволяет выполнять операции потока параллельно.
    Обычный Stream выполняет операции последовательно, обрабатывая каждый элемент в потоке в порядке его появления.
    Но когда поток содержит много элементов, это может занять много времени.
    parallelStream предоставляет возможность распараллеливать обработку потока, что может привести к более быстрой обработке элементов.

    parallelStream необходимо использовать только тогда, когда мы планируем обработать большое количество элементов.
*/
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        // parallelStream необходимо использовать только в тех случаях, где порядок выполнения программы не имеет значения, например нахождение суммы чисел
        int resultSum = listInteger.parallelStream().reduce((accumulator, element)-> element + accumulator).get();
        System.out.println(resultSum);

        // Там где порядок выполнения программы имеет значение, например деление, результат будет не верным
        int resultDivision = listInteger.parallelStream().reduce((accumulator, element)-> element / accumulator).get();
        System.out.println(resultDivision);
    }
}
