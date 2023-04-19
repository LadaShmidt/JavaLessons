package Lambda.ForEach;
import java.util.List;
/*
    Интерфейс forEach() это метод, который объявлен в интерфейсе Iterable<T> и реализуется во многих классах коллекций
    (например, List, Set, Map и других). Он позволяет применять заданную операцию к каждому элементу коллекции.
*/
public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Red", "One");

        // Краткий вариант записи вывода в консоль
        list.forEach(System.out::println);

        // В параметр forEach можно передавать методы
        list.forEach(Utils::myMethod);
    }
}

class Utils {
    public static void myMethod(String str) {
        str = str + "1";
        System.out.println(str);
    }
}
