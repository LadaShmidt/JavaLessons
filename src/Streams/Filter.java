package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
    Метод filter() это метод, который принимает в качестве аргумента объект-предикат и возвращает новый поток,
    содержащий элементы из исходного потока, удовлетворяющие условию, заданному предикатом.
*/
public class Filter {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,2,8,7,22);

        List<Integer> evenIntegers = integers.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        System.out.println(evenIntegers);
    }
}
