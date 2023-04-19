package Encapsulation;

public class Main {
    public static void main(String[] args) {
        SayCatService sayCatService = new SayCatService();

        // Создание объекта с конструктором с аргументами выглядит так:
        Cat stepan = new Cat("Stepan");
        sayCatService.say(stepan, "I want to eat");

        Cat alex = new Cat("Alex");
        sayCatService.say(alex, "I want to sleep");

        Cat kesha = new Cat("Kesha");
        sayCatService.say(kesha, "I want to play");

        /*Для вызова статических методов и переменных необходимо обращаться к классу, а не объекту
        Так как статические переменные и методы принадлежат классу, а не объекту*/
        SayCatService.sayMeow();
        System.out.println(SayCatService.hello);
    }
}
