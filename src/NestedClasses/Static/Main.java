package NestedClasses.Static;

public class Main {
    public static void main(String[] args) {
        // Создавая объект static nested класса, нужно указывать и класс, содержащий его.
        Car.Engine engine = new Car.Engine(256);

        // Экземпляр статического вложенного класса может быть передан в качестве параметра в конструктор внешнего класса
        Car car = new Car("Black", 4, engine);
    }
}
