package Casting;

public class Main {
    public static void main(String[] args) {
        // Upcasting - casting из subclass в superclass происходит автоматически
        Employee employee = new Driver();
        // Downcasting - casting из superclass в subclass НЕ происходит автоматически
        Driver driver = (Driver) employee;
        driver.drive();

        // Можно вызвать метод subclass на переменной типа superclass с помощью downcasting
        ((Driver)employee).drive();
    }
}
