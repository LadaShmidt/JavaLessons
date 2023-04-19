package BooleanLogic;
// Для обращения к классу Scanner по короткому имени нам необходимо импортировать данный класс
import java.util.Scanner;

public class IFelse {
    public static void main(String[] args) {
        // Для ввода в консоль мы обращаемся к классу Scanner и создаем новый объект с помощью конструктора
        Scanner inputFromLine = new Scanner(System.in);

        // Объявляем три примитивные численные переменные типа int
        int firstNumber;
        int secondNumber;
        int result;

        // Тип данных String это полноценный ссылочный тип данных (класс)
        String inputFirstNumber = "Введите первое число";
        String inputSecondNumber = "Введите второе число";
        String firstBigger = "Первое число больше";
        String secondBigger = "Второе число больше";
        String numbersEquals = "Числа равны";

        // С помощью метода System.out.println(), объекта InputFromLine и метода nextInt() мы задаем значение нашим переменным
        System.out.println(inputFirstNumber);
        firstNumber = inputFromLine.nextInt();

        System.out.println(inputSecondNumber);
        secondNumber = inputFromLine.nextInt();

        result = firstNumber + secondNumber;
        System.out.println("Сумма: " + result);

        // Логические ветвления if/else
        if (firstNumber > secondNumber) {
            System.out.println(firstBigger);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondBigger);
        } else {
            System.out.println(numbersEquals);
        }
    }
}
