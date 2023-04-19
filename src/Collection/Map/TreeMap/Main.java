package Collection.Map.TreeMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Student, Integer> treeMap = new TreeMap<>();

        Student st1 = new Student("Bob", "Harrison", 5);
        Student st2 = new Student("Elisa", "Watson", 1);
        Student st3 = new Student("Bill", "Red", 4);
        Student st4 = new Student("Olga", "Krylova", 2);
        Student st5 = new Student("Olga", "Krylova", 2);
        Student st6 = new Student("Egor", "Kuznetcov", 5);

        treeMap.put(st2, 5);
        treeMap.put(st4, 1);
        treeMap.put(st1, 0);
        treeMap.put(st3, 3);
        // При попытке добавления ключей с одинаковым ключем, старый элемент будет затерт новым, ключи TreeMap должны быть уникальными
        treeMap.put(st5, 2);

        System.out.println(treeMap);

        // Метод putIfAbsent() добавляет элемент в коллекцию, если такой элемент отсутствует в ней
        treeMap.putIfAbsent(st5, 2);
        // Метод get() позволяет получить элемент принимая в параметр ключ данного элемента
        treeMap.get(st1);
        // Метод remove() удаляет элемент из коллекции принимая в параметр ключ данного элемента
        treeMap.remove(st4);
        // Метод containsValue() возвращает true, если такой элемент присутствует в коллекции
        treeMap.containsValue(9.2);
        // Метод containsKey() возвращает true, если такой ключ присутствует в коллекции
        treeMap.containsKey(st5);
        // Метод keySet() возвращает множество всех ключей в коллекции
        treeMap.keySet();
        // Метод values() возвращает множество значений в коллекции
        treeMap.values();
        // Метод descendingMap() разворачивает коллекцию в обратную сторону
        treeMap.descendingMap();
        // Метод tailMap() возвращает все элементы больше элемента принятого в параметр
        treeMap.tailMap(st4);
        // Метод headMap() возвращает все элементы меньше элемента принятого в параметр
        treeMap.headMap(st4);
        // Метод lastEntry() вовзращает последний элемент коллекции
        treeMap.lastEntry();
        // Метод firstEntry() возвращает первый элемент коллекции
        treeMap.firstEntry();
    }
}
