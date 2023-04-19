package Interface;
import Interface.LunchInterface.*;
public class Main {
    public static void main(String[] args) {
        // Можно ссылаться на объект переменной типа интерфейса, который этот класс имплементирует
        // С помощью переменной teacher мы можем обращаться только к тем элементам класса Teacher, которые есть у интерфейса lunch
        Lunch teacher = new Teacher();
    }
}
