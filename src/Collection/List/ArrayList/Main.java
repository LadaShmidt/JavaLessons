package Collection.List.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Bob",20, 1);
        Student st2 = new Student("Bill", 16, 2);
        Student st3 = new Student("Maria", 22, 3);

        // Все спопобы объявления ArrayList
        ArrayList<Student> arrayList1 = new ArrayList<Student>();
        ArrayList<Student> arrayList2 = new ArrayList<>();
        ArrayList<Student> arrayList3 = new ArrayList<>(200);
        List<Student> arrayList4 = new ArrayList<>();

        // Распространенные методы класса ArrayList

        // Метод add() - добавляет элемент в конец списка.
        arrayList1.add(st1);

        // Добавляет элемент в определенный индекс
        arrayList1.add(1, st2);

        // Метод addAll() добавляет список в другой список
        arrayList1.addAll(arrayList2);

        // Добавляет список в другой список начиная с определенного индекса
        arrayList1.addAll(0, arrayList2);

        // Метод get() получает элемент из списка по индексу.
        arrayList1.get(0);

        // Метод remove() удаляет элемент из списка по индексу.
        arrayList1.remove(0);

        // Метод set() заменяет элемент в списке по индексу на заданный элемент.
        arrayList1.set(0, st3);

        // Метод size() возвращает количество элементов в списке.
        arrayList1.size();

        // Метод indexOf() получает индекс из списка по элементу
        arrayList1.indexOf(st3);

        // Метод  isEmpty() проверяет список на наличие элементов
        arrayList1.isEmpty();

        // Метод contains() проверяет содержит ли список искомый элемент
        arrayList1.contains(st1);

        // Метод removeAll() удаляет из списка все элементы другого списка
        arrayList1.removeAll(arrayList2);

        // Метод retainAll() удаляет из списка все элементы кроме совпадений во втором списке
        arrayList1.retainAll(arrayList2);

        // Метод containsAll() пропверяет содержит ли список все элементы второго списка
        arrayList1.containsAll(arrayList2);

        // Метод clear() полностью очищает список
        arrayList1.clear();

        // Метод subList() создает представление списка на основе отрывка самого списка в интервале индексов
        List<Student> listString = arrayList1.subList(0, 0);

        // Метод toArray() создает массив типа Object на основании списка
        Object[] objectArray = arrayList1.toArray();

        // Создает массив любого ссылочного типа на основании списка
        String[] stringArray = arrayList1.toArray(new String[0]);

        // Метод List.of() создает неизменяемый список
        List<Integer> listInteger = List.of(1,2,3);

        // Метод copyOf() создает неизменяемый список на основе другого списка
        List<Student> stringList = List.copyOf(arrayList1);
    }
}
