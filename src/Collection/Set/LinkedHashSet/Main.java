package Collection.Set.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Bob",20, 1);
        Student st2 = new Student("Bill", 16, 2);
        Student st3 = new Student("Maria", 22, 3);
        Student st4 = new Student("Olya", 18, 2);
        Student st5 = new Student("Olya", 18, 2);

        LinkedHashSet<Student>  linkedHashSet = new LinkedHashSet<>();
        LinkedHashSet<Student>  linkedHashSet2 = new LinkedHashSet<>();

        linkedHashSet.add(st1);
        linkedHashSet.add(st2);
        linkedHashSet.add(st3);
        linkedHashSet.add(st4);
        // При попытке добавления ключей с одинаковым значением, старый элемент будет затерт новым, элементы LinkedHashSet должны быть уникальными
        linkedHashSet.add(st5);

        // Распространенные методы класса ArrayList

        // Метод add() - добавляет элемент в конец множества.
        linkedHashSet.add(st1);

        // Метод addAll() добавляет множество в другое множество.
        linkedHashSet.addAll(linkedHashSet2);

        // Метод remove() удаляет элемент из множества.
        linkedHashSet.remove(st1);

        // Метод size() возвращает количество элементов в множестве.
        linkedHashSet.size();

        // Метод  isEmpty() проверяет множество на наличие элементов.
        linkedHashSet.isEmpty();

        // Метод contains() проверяет содержит ли множество искомый элемент.
        linkedHashSet.contains(st1);

        // Метод removeAll() удаляет из множества все элементы другого множества.
        linkedHashSet.removeAll(linkedHashSet2);

        // Метод retainAll() удаляет из множества все элементы кроме совпадений во втором множестве.
        linkedHashSet.retainAll(linkedHashSet2);

        // Метод containsAll() пропверяет содержит ли множество все элементы второго множества.
        linkedHashSet.containsAll(linkedHashSet2);

        // Метод clear() полностью очищает множество.
        linkedHashSet.clear();

        // Метод toArray() создает массив типа Object на основании множества.
        Object[] objectArray = linkedHashSet.toArray();

        // Создает массив любого ссылочного типа на основании множества.
        String[] stringArray = linkedHashSet.toArray(new String[0]);
    }
}
