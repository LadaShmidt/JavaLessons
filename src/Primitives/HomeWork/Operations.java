package Primitives.HomeWork;
/* 2
 * Создайте класс, имя класса Operations
 * В методе main создайте все типы численных переменных
 * Проведите над ними математические операции (не только с одинаковыми, но и между разными типами данных)
 * Создайте переменные под результат операций
 * Выведите все результаты в консоль
 */
public class Operations {
    public static void main(String[] args) {
        byte byteValue = 1;
        int intValue = 10;
        long longValue = 20;
        short shortValue = 5;
        double doubleValue = 5.5;
        float floatValue = 2.2f;

        double sum = byteValue + doubleValue;
        double substraction = intValue - floatValue;
        long multiplication = longValue * shortValue;
        double devision = floatValue / doubleValue;
        int reminder = intValue % byteValue;

        System.out.println("Сумма: " + sum);
        System.out.println("Вычитание: " + substraction);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление: " + devision);
        System.out.println("Взятие остатка: " + reminder);
    }
}
