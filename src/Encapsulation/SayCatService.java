package Encapsulation;

public class SayCatService {
    // Данный пример показывает не только инкапсуляцию, и разбиение кода на уровни абстракции
    // В данном классе мы разделили непосредственное создание сообщения и вывод его в консоль

    /*
    * Статические методы и переменные можно вызвать без создания объекта класса
    * В основном статическое объявление переменных хорошо подходит для констант
    * Так как их значение будет доступно всем и это значение будет единственное для всех
    * Если мы измении значение  статической переменной, то значение поменяется для всех кто его будет читать
    * В то время как объектов с нестатическим состоянием, мы можем создавать любое количество
    * И изменяя один, другие меняться не будут
    */
    public static String hello = "Hello from static!";
    public static void sayMeow(){
        System.out.println("Meow");
    }

    // Метод создания сообщения
    private String concatNameAndMessage (String name, String message) {
        return name + ": " + message;
    }

    // Метод вывода сообщения в консоль
    public void say (Cat cat, String message) {
        String catName = cat.getName();
        System.out.println(concatNameAndMessage(catName, message));
    }
}
