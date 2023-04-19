package Collection.Set.HashSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Student st1 = new Student("Bob",20, 1);
       Student st2 = new Student("Bill", 16, 2);
       Student st3 = new Student("Maria", 22, 3);
       Student st4 = new Student("Maria", 22, 3);

       Set<Student> hashSet = new HashSet<>();

       // Метод add() - добавляет элемент в конец списка.
       hashSet.add(st1);
       hashSet.add(st2);
       hashSet.add(st3);
       // При попытке добавления ключей с одинаковым значением, старый элемент будет затерт новым, элементы HashSet должны быть уникальными
       hashSet.add(st4);

       System.out.println(hashSet);

       // Метод size() возвращает количество элементов в списке.
       hashSet.size();

       // Метод remove() удаляет элемент из списка по индексу.
       hashSet.remove(st2);

       // Метод contains() проверяет содержит ли список искомый элемент
       hashSet.contains(st1);

       HashSet<Integer> firstSet = new HashSet<>();
       firstSet.add(5);
       firstSet.add(2);
       firstSet.add(3);
       firstSet.add(1);
       firstSet.add(8);

       HashSet<Integer> secondSet = new HashSet<>();
       secondSet.add(7);
       secondSet.add(4);
       secondSet.add(3);
       secondSet.add(5);
       secondSet.add(8);

       // Метод addAll() добавляет множество в другое множество исключая дубликаты
       HashSet<Integer> unionSet = new HashSet<>(firstSet);
       unionSet.addAll(secondSet);

       // Метод retainAll() удаляет из множества все элементы кроме совпадений во втором множестве
       HashSet<Integer> intersectSet = new HashSet<>(firstSet);
       intersectSet.retainAll(secondSet);

        // Метод removeAll() удаляет из множества все элементы другого множества
       HashSet<Integer> subtractSet = new HashSet<>(firstSet);
       subtractSet.removeAll(secondSet);
    }
}
