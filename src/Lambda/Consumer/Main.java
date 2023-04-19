package Lambda.Consumer;
import java.util.ArrayList;
import static Lambda.Consumer.Car.*;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mersedes", "Blue", 1.6);
        Car car2 = new Car("Mersedes", "Blue", 1.6);
        Car car3 = new Car("Mersedes", "Blue", 1.6);

        ArrayList<Car> ourCars = new ArrayList<>();
        ourCars.add(car1);
        ourCars.add(car2);
        ourCars.add(car3);

        // Реализация функционального метода класса Consumer для одного элемента списка
        ourCars.subList(0,1).forEach(changeCar1);

        // Реализация функционального метода класса Consumer для всех элементов списка
        ourCars.forEach(changeCar1);

        // Реализация функционального метода класса Consumer с помощью lambda expressions
        changeCar2(ourCars.get(0), car -> {
            car.setColor("red");
            car.setEngine(2.4);
        });
    }
}
