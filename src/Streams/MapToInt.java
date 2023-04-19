package Streams;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
    Метод mapToInt предназначен для преобразования потока объектов в поток примитивных типов int.
*/
public class MapToInt {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 20000);
        Car bmw = new Car("BMW", 100000);
        Car audi = new Car("AUDI", 500000);

        List<Car> listCar = new ArrayList<>();
        listCar.add(nissan);
        listCar.add(bmw);
        listCar.add(audi);

        // Преобразуем наш список машин в список их стоимости типа int, для конвертации int -> Integer нам поможет метод boxed()
        List<Integer> listCost = listCar.stream().mapToInt(element -> element.getCost()).boxed().collect(Collectors.toList());

        // У метода mapToInt() есть метод sum(), с помощью которого мы можем проссумирвоать стоимость наших машин
        int sum = listCar.stream().mapToInt(element -> element.getCost()).sum();

        // У метода mapToInt() есть метод average(), с помощью которого мы можем найти среднюю стоимость наших машин
        double average = listCar.stream().mapToInt(element -> element.getCost()).average().getAsDouble();

        // У метода mapToInt() есть метод min(), с помощью которого мы можем найти минимальную стоимость наших машин
        int min = listCar.stream().mapToInt(element -> element.getCost()).min().getAsInt();

        // У метода mapToInt() есть метод max(), с помощью которого мы можем найти максимальную стоимость наших машин
        int max = listCar.stream().mapToInt(element -> element.getCost()).max().getAsInt();
    }
}
class Car{
    private String name;
    private int cost;
    Car (String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public String toString(){
        return name + " " + cost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int salary) {
        this.cost = cost;
    }
}