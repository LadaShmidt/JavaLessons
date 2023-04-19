package Constructions.HomeWork;
import java.util.Scanner;
/*
* Реализовать простой калькулятор используя конструкцию switch-case
* C консоли вводится два числа, которые будут принимать участие в операции
* Далее выводится сообщение в таком виде:
* Выберите операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком
* Вывести результат операции
*/
public class Calculator {
    public static void main(String[] args) {
        Calculating();
    }
    public static void Calculating() {
        Scanner inputFromLine = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int operator;
        int result;

        System.out.println("Введите первое число: ");
        firstNumber = inputFromLine.nextInt();
        System.out.println("Введите второе число: ");
        secondNumber = inputFromLine.nextInt();
        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4- целочисленное деление, 5 - деление с остатком, 6 - сравнение");
        operator = inputFromLine.nextInt();

        switch (operator) {
            case 1: result = firstNumber + secondNumber;
                System.out.println("Результат: " + result);
                break;
            case 2: result = firstNumber - secondNumber;
                System.out.println("Результат: " + result);
                break;
            case 3: result = firstNumber * secondNumber;
                System.out.println("Результат: " + result);
                break;
            case 4: result = firstNumber / secondNumber;
                System.out.println("Результат: " + result);
                break;
            case 5: result = firstNumber % secondNumber;
                System.out.println("Результат: " + firstNumber / secondNumber + " Остаток: " +result);
                break;
            case 6: if(firstNumber > secondNumber) {
                System.out.println("Первое число больше второго");
            } else if (secondNumber > firstNumber) {
                System.out.println("Второе число больше первого");
            } else {
                System.out.println("Числа равны");
            }
                break;
            default:
                System.out.println("error: Такой операции не существует");
        }
    }
}
