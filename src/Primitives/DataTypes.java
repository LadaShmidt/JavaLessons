package Primitives;

public class DataTypes {
    // Метод main является точкой запуска нашей программы и необходим для её запуска
    public static void main(String[] args) {
        // Метод System.out.println позволяет выводить в консоль информацию разных типов
        System.out.println("Hello World");

        // Примитивные типы данных:
        byte b1;    // Размер 8 бит = 1 байт   -128 до 127
        long l;     // Размер 64 бит = 8 байт  -2^63 до 2^63
        int i;      // Размер 32 бит = 4 байт  -2^31 до 2^31
        short s;    // Размер 16 бит = 2 байт  -32768 до 32767
        double d;   // Размер 64 бит = 8 байт  -1.7E^308 до 1.7E^308
        float f;    // Размер 32 бит = 4 байт  -3.4E^38 до 3.4E^38
        char c;     // Размер 16 бит = 2 байта  0 до 65,535
        boolean b2; // Размер 8 бит = 1 байт    true или false


        int firstNumber = 10;
        int secondNumber = 5;
        int sum;
        int substraction;
        int multiplication;
        int devision;
        int reminder;

        // Оператор сложения
        sum = firstNumber + secondNumber;
        // Оператор вычитания
        substraction = firstNumber - secondNumber;
        // Оператор умножения
        multiplication = firstNumber * secondNumber;
        // Оператор деления
        devision = firstNumber / secondNumber;
        // Оператор взятия остатка от деления
        reminder = firstNumber % secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Вычитание: " + substraction);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление: " + devision);
        System.out.println("Остаток от деления: " + reminder);
    }
}
