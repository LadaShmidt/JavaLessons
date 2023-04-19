package Methods.Equals;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V6");
        Car c2 = new Car("Red", "V6");
        Car c3 = new Car("Red", "V4");

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}
