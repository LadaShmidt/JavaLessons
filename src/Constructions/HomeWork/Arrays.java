package Constructions.HomeWork;
import java.util.Scanner;
import java.util.Random;
/*
* Нужно считать с консоли число, создать целочисленный массив размером введенного числа
* Заполнить его (с помощью класса Random())
* Пробежаться по массиву в цикле и найти совпадающее число с введенным (второе введенное число)
* Вывести результат в консоль (нашлось или нет)
* Поиск числа в массиве реализовать с помощью цикла forEach
* Далее необходимо найти наибольшее и наименьшее число в данном массиве
*/
public class Arrays {
    public static void main(String[] args) {
        randomArray();
    }

    public static void randomArray(){
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1001;

        int arrayLength;
        int inputValue;
        Random random = new Random();
        System.out.println("Задайте размер массива");
        arrayLength = input.nextInt();
        System.out.println("Задайте искомое число");
        inputValue = input.nextInt();


        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        array[5] = 500;
        int count = 0;
        for (int element: array) {
            if (element == inputValue) {
                count++;
            }
        }
        System.out.println("Такое число есть в массиве в количестве " + count + " штук");

        int arraysElement = array[0];

        for (int element: array) {
            if (element > arraysElement) {
                arraysElement = element;
            }
        }
        System.out.println("Наибольшее число в массиве: " + arraysElement);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < arraysElement) {
                arraysElement = array[i];
            }
        }
        System.out.println("Наименьшее число в массиве: " + arraysElement);
    }
}
