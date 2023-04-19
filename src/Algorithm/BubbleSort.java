package Algorithm;

import java.util.ArrayList;
import java.util.List;

/*
 * Сортировка пузырьком - метод сравнивает попарно элементы массива, таким образом что максимальный элемент перемещается на последнее место в массиве
 * Вторым проходом, следующий по величине элемент переместится на предпоследнее место
 * Таким образом, самый маленький элемент массива "всплывает" в начало массива
 */
public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(0);
        list.add(9);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        System.out.println(list);

        boolean isSorted = true;
        while(isSorted) {
            isSorted = false;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i-1) > list.get(i)) {
                    int temp = list.get(i-1);
                    list.set(i-1, list.get(i));
                    list.set(i, temp);
                    isSorted = true;
                }
            }
        }
        System.out.println(list);
    }

    /*
     * Данный алгоритм реализует сортировку пузырьком. Сложность алгоритма по времени составляет O(n^2),
     * Где n - количество элементов в массиве. Это связано с тем, что алгоритм выполняет n проходов по массиву,
     * И на каждом проходе выполняется n операций сравнения и обмена элементов в худшем случае.
     * Таким образом, время выполнения алгоритма увеличивается квадратично с ростом размера массива.
     */
}
