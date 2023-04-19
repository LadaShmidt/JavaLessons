package Lambda.Supplier;
import java.util.ArrayList;
import java.util.function.Supplier;
/*
   Supplier (поставщик) - это функциональный интерфейс, который не принимает параметров и возвращает значение.
   Supplier имеет один абстрактный метод get(), который возвращает результат типа T.

   Это позволяет создавать новые объекты без явного указания их типа в методе, что делает код более универсальным и гибким.
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
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            // Добавляем в список объекты, которые поставляет supplier
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }
}
