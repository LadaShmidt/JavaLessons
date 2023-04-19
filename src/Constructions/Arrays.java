package Constructions;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];

        // С помощью цикла for наполняем массив значениями вводимыми в консоль
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }

        printArray(array);
    }

    // Создаем метод вывода массива в консоль
    public static void printArray(int[] array) {
        // С помощью цикла forEach мы перебираем массив и выводим его в консоль
        for (int element: array) {
            System.out.println(" Значение элемента: " + element);
        }
    }
}
