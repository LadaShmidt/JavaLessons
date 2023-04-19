package Collection.Map.LinkedHashMap;
import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Bob",20, 1);
        Student st2 = new Student("Bill", 16, 2);
        Student st3 = new Student("Maria", 22, 3);
        Student st4 = new Student("Olya", 18, 2);
        Student st5 = new Student("Olya", 18, 2);

        LinkedHashMap<Integer, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        /* loadFactor это параметр, используемый при создании объектов классов HashMap, HashSet, Hashtable и LinkedHashMap, который определяет,
           какая часть от общей емкости хранилища должна быть заполнена до того, как произойдет увеличение размера хранилища (рехэширование). */

        /* accessOrder является опциональным параметром, используемым в классе LinkedHashMap.
           Он определяет порядок, в котором элементы хранятся в этой структуре данных, основанный на их доступности.
           Если установлено значение true, последний использованный элемент будет помещен в конец структуры данных, а самый редко используемый элемент будет помещен в начало.
           Если установлено значение false элементы будут упорядочены в порядке добавления в структуру данных. */

        linkedHashMap.put(1, st1);
        linkedHashMap.put(2, st2);
        linkedHashMap.put(3, st3);
        linkedHashMap.put(4, st4);
        // При попытке добавления ключей с одинаковым значением, старый элемент будет затерт новым, элементы LinkedHashMap должны быть уникальными
        linkedHashMap.put(4, st5);

        // До использования элементов
        System.out.println(linkedHashMap);

        linkedHashMap.get(1);
        linkedHashMap.get(2);

        // После использования элементов
        System.out.println(linkedHashMap);
    }
}
