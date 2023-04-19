package Overriding;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // Для compile time binding это объект типа Animal, а для runtime binding это объект типа Snake
        // С помощью переменной animal мы можем обращаться только к тем элементам класса Snake, которые есть у класса Animal
        Animal animal = new Snake();

        /*
        * Compile time binding используется для переменных, так как их тип заранее определен
        * Compile time binding используется для private, static, final методов, так как они не могут быть override
        * Compile time binding используется для overloaded методов, для выбора правильной версии перегруженного метода во время компиляции программы
        *
        * Runtime binding используется для overriding методов, а также для динамической загрузки классов и выполнения полиморфных вызовов методов
        */

        // Compile time binding - так как метод является final он не может быть перезаписан - привязывается super class
        animal.amountPaw();

        // Run time binding - так как метод не является final, static, private и он перезаписан - привязывается subclass
        animal.moving();
    }
}