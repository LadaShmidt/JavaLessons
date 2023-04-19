package Collection.Map.HashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>(16, 0.75f);
        /* loadFactor это параметр, используемый при создании объектов классов HashMap, HashSet, Hashtable и LinkedHashMap, который определяет,
           какая часть от общей емкости хранилища должна быть заполнена до того, как произойдет увеличение размера хранилища (рехэширование). */
        Student st1 = new Student("Oleg", "Shevcov", 3);
        Student st2 = new Student("Sergey", "Ivanov", 1);
        Student st3 = new Student("Maria", "Petrova", 4);
        Student st4 = new Student("Maria", "Petrova", 4);
        Student st5 = new Student("Egor", "Kuznetcov", 5);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        // При попытке добавления ключей с одинаковым значением, старый элемент будет затерт новым, элементы HashMap должны быть уникальными
        map.put(st4, 10.0);

        // Вернет true если переопределены оба метода equals() и hashCode
        System.out.println(map.containsKey(st4));

        // Вывод элементов HashMap в консоль с помощью метода entrySet
        for(Map.Entry<Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Метод putIfAbsent() добавляет элемент в коллекцию, если такой элемент отсутствует в ней
        map.putIfAbsent(st5, 2.5);
        // Метод get() позволяет получить элемент принимая в параметр ключ данного элемента
        map.get(st1);
        // Метод remove() удаляет элемент из коллекции принимая в параметр ключ данного элемента
        map.remove(st4);
        // Метод containsValue() возвращает true, если такой элемент присутствует в коллекции
        map.containsValue(9.2);
        // Метод containsKey() возвращает true, если такой ключ присутствует в коллекции
        map.containsKey(st5);
        // Метод keySet() возвращает множество всех ключей в коллекции
        map.keySet();
        // Метод values() возвращает множество значений в коллекции
        map.values();
    }
}
