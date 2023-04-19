package Lambda.Consumer;
import java.util.function.Consumer;
/*
   Consumer (потребитель) - это функциональный интерфейс, принимает аргумент и не возвращает значение.
   Consumer имеет один абстрактный метод accept(T t), который принимает объект типа T и не возвращает значение.

   Это позволяет создавать изменять объекты без явного указания их типа в методе, что делает код более универсальным и гибким.
*/
public class Car {
    private String model;
    private String color;
    private double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
    @Override
    public String toString(){
        return "Model: " + model + ", color: " + color + ", engine: " + engine;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getEngine() {
        return engine;
    }
    public void setEngine(double engine) {
        this.engine = engine;
    }
    public static Consumer<Car> changeCar1 = car -> {
        car.setColor("red");
        car.setEngine(2.4);
        System.out.println(car);
    };
    public static void changeCar2(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
}
