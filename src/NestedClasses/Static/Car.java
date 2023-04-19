package NestedClasses.Static;
/*
    Static nested class похож на обычный внешний класс, но находится внутри другого класса.
*/
public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int model = 5;
    Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method() {
        // Внешний класс может обращаться к static элементами static nested класса
        System.out.println(Engine.countOfObjects);

        // Внешний класс может обращаться к private элементами static nested класса
        Engine engine = new Engine(256);
        System.out.println(engine.horsePower);
    }
    public static class Engine {
        private int horsePower;
        // Static nested класс может содержать static и non-static элементы.
        static int countOfObjects;
        Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
        }
        void method() {
            // Static nested класс может обращаться к private элементам внешнего класса, но только к static
            System.out.println(model);
        }
    }
}
