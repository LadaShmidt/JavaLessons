package Hiding;

public class Teacher extends Employee {
    // Происходит сокрытие метода
    static void eat() {
        System.out.println("Teacher eat");
    }
}
