package Algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Линейный поиск используется для нахождения ключа (индекса) в списке или массиве.
 * Представляет из себя цикл, внутри которого присутствует условие на сравнение текущего элемента с искомым.
 * Путем последовательного прохода по элементам в цикле, находится  нужный элемент и мы получаем его индекс.
 */
public class Linear {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                new String("Hello"),
                new String("World"),
                new String("and"),
                new String("Universe")
        ));
        System.out.println(linearSearch(stringList, "World"));
    }

    /*
     * Данный алгоритм реализует линейный поиск элемента в списке.
     * В худшем случае алгоритм будет искать элемент до конца списка, то есть выполнит n операций,
     * Где n - количество элементов в списке. Следовательно, сложность алгоритма по времени составляет O(n), где n - размер списка.
     */
    private static int linearSearch(List<String> list, String arg) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(arg)) {
                return i;
            }
        }
        return -1;
    }
}
