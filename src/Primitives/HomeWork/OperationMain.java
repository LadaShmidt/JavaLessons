package Primitives.HomeWork;
import static Primitives.HomeWork.OperationsMethods.*;
public class OperationMain {
    public static void main(String[] args) {
        byte byteValue = 1;
        int intValue = 10;
        long longValue = 20;
        short shortValue = 5;
        double doubleValue = 5.5;
        float floatValue = 2.2f;

        System.out.println("Сумма: " + sum(byteValue, doubleValue));
        System.out.println("Вычитание: " + substraction(intValue, floatValue));
        System.out.println("Умножение: " + multiplication(longValue, shortValue));
        System.out.println("Деление: " + devision(floatValue, doubleValue));
        System.out.println("Остаток: " + reminder(intValue, byteValue));
    }
}
