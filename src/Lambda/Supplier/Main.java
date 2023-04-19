package Lambda.Supplier;
import java.util.ArrayList;
import static Lambda.Supplier.Car.*;

public class Main {
    public static void main(String[] args) {
        // Реализация функционального метода класса Supplier
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tilda", "Silver metallic", 1.6));
    }
}
