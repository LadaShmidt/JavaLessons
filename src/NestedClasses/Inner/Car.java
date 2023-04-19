package NestedClasses.Inner;
/*
    Каждый объект inner класса всегда ассоциируется с объектом внешнего класса.
    Создавая объект inner класса, нужно перед этим создать объект его внешнего класса.
*/
public class Car {
    String color;
    int doorCount;
    Engine engine;
    Car(String color, int doorCount, int horsePower) {
        // Внешний класс может обращаться даже к private элементам inner класса, прежде создав его объект
        Engine e = new Engine(256);
        System.out.println(e.horsePower);

        this.color = color;
        this.doorCount = doorCount;
        // Пример создания экземпляра inner класса
        this.engine = this.new Engine(horsePower);
    }
    public class Engine {
        // Inner класс может содержать только non-static элементы.
        private int horsePower;
        Engine(int horsePower) {
            this.horsePower = horsePower;
        }
        void method() {
            // Inner класс может обращаться даже к private элементам внешнего класса.
            System.out.println(color);
        }
    }
}
