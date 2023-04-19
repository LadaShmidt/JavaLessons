package Arrays;
import java.util.Arrays;
import java.util.Random;
/*
* Array в Java - это фиксированный размер коллекции элементов определенного типа,
* Хранящихся в памяти последовательно. Он может содержать элементы одного типа и имеет фиксированный размер.
* Элементы массива доступны по индексу, начиная с 0.
* Обратите внимание, что после создания массива его размер не может быть изменен, но его элементы могут быть изменены.
*/
public class _Array {
    public static void main(String[] args) {
        // Примеры объявления и инициализации Array

        // Объявление массива:
        int[] numbers1;

        // Создание массива с определенным размером:
        int[] numbers2 = new int[5];

        // Объявление массива и инициализация его элементов:
        int[] numbers3 = {1,2,3,4,5};

        // Объявление массива и инициализация его элементов в цикле:
        int[] numbers4 = new int[5];
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = i;
        }

        // Объявление двумерного массива:
        int[][] matrix1 = new int[3][3];

        // Объявление и инициализация двумерного массива:
        int[][] matrix2 = new int[3][3];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = i * 3 + j + 1;
            }
        }

        // Создание и инициализация массива при помощи метода Arrays.copyOf(), который копирует элементы из другого массива:
        int[] numbers5 = {1,2,3,4,5};
        int[] copiedNumbers5 = Arrays.copyOf(numbers5, numbers5.length);

        // Создание массива при помощи метода Arrays.fill(), который заполняет массив определенным значением
        int[] numbers6 = new int[5];
        Arrays.fill(numbers6,0);

        // Объявление и инициализация массива случайными числами с помощью класса Random и метода nextInt():
        int[] numbers7 = new int[10];
        Random random1 = new Random();
        for (int i = 0; i < numbers7.length; i++) {
            numbers7[i] = random1.nextInt(101);
        }

        // Объявление и инициализация двумерного массива случайными числами с помощью класса Random и метода nextInt():
        int[][] numbers8 = new int[10][10];
        Random random2 = new Random();
        for (int i = 0; i < numbers8.length; i++) {
            for (int j = 0; j < numbers8[i].length; j++) {
                numbers8[i][j] = random2.nextInt(101);
            }
        }

        // Далее рассмотрим некоторые методы класса Array

        // Метод sort() - сортирует указанный массив целых чисел в порядке возрастания:
        int[] array1 = {5,6,2,4,3,1};
        Arrays.sort(array1);

        // Метод equals() - проверяет, равны ли два указанных массива целых чисел:
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {1,2,3,4,5};
        Arrays.equals(array2,array3);

        // Метод toString() - возвращает строковое представление указанного массива целых чисел.
        int[] array4 = {1,2,3,4,5};
        Arrays.toString(array4);

        // Метод copyOfRange() - создает новый массив целых чисел, который является копией указанного массива, начиная с указанного индекса from и заканчивая индексом to.
        int[] array5 = {1,2,3,4,5};
        Arrays.copyOfRange(array5, 0, 2);
    }
}
