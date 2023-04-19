package Collection.List.LinkedList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Bob",20, 1);
        Student st2 = new Student("Bill", 16, 2);
        Student st3 = new Student("Maria", 22, 3);

        // Все спопобы объявления LinkedList
        LinkedList<Student> linkedList1 = new LinkedList<Student>();
        LinkedList<Student> linkedList2 = new LinkedList<>();
        LinkedList<Student> linkedList3 = new LinkedList<>();
        List<Student> linkedList4 = new LinkedList<>();

        // Распространенные методы класса ArrayList

        // Метод add() - добавляет элемент в конец списка.
        linkedList1.add(st1);

        // Добавляет элемент в определенный индекс
        linkedList1.add(1, st2);

        // Метод addAll() добавляет список в другой список
        linkedList1.addAll(linkedList2);

        // Добавляет список в другой список начиная с определенного индекса
        linkedList1.addAll(0, linkedList2);

        // Метод get() получает элемент из списка по индексу.
        linkedList1.get(0);

        // Метод remove() удаляет элемент из списка по индексу.
        linkedList1.remove(0);

        // Метод set() заменяет элемент в списке по индексу на заданный элемент.
        linkedList1.set(0, st3);

        // Метод size() возвращает количество элементов в списке.
        linkedList1.size();

        // Метод indexOf() получает индекс из списка по элементу
        linkedList1.indexOf(st3);

        // Метод  isEmpty() проверяет список на наличие элементов
        linkedList1.isEmpty();

        // Метод contains() проверяет содержит ли список искомый элемент
        linkedList1.contains(st2);

        // Метод removeAll() удаляет из списка все элементы другого списка
        linkedList1.removeAll(linkedList2);

        // Метод retainAll() удаляет из списка все элементы кроме совпадений во втором списке
        linkedList1.retainAll(linkedList2);

        // Метод containsAll() пропверяет содержит ли список все элементы второго списка
        linkedList1.containsAll(linkedList2);

        // Метод clear() полностью очищает список
        linkedList1.clear();

        // Метод subList() создает представление списка на основе отрывка самого списка в интервале индексов
        List<Student> listString = linkedList1.subList(0, 0);

        // Метод toArray() создает массив типа Object на основании списка
        Object[] objectArray = linkedList1.toArray();

        // Создает массив любого ссылочного типа на основании списка
        String[] stringArray = linkedList1.toArray(new String[0]);

        // Метод List.of() создает неизменяемый список
        List<Integer> listInteger = List.of(1,2,3);

        // Метод copyOf() создает неизменяемый список на основе другого списка
        List<Student> stringList = List.copyOf(linkedList1);
    }
}
