package Collection.Set.TreeSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student st1 = new Student("Bob", "Harrison", 5);
        Student st2 = new Student("Elisa", "Watson", 1);
        Student st3 = new Student("Bill", "Red", 4);
        Student st4 = new Student("Olga", "Krylova", 2);
        Student st5 = new Student("Olga", "Krylova", 2);
        Student st6 = new Student("Egor", "Kuznetcov", 5);

        treeSet.add(st2);
        treeSet.add(st4);
        treeSet.add(st1);
        treeSet.add(st3);
        // При попытке добавления ключей с одинаковым ключем, старый элемент будет затерт новым, ключи TreeMap должны быть уникальными
        treeSet.add(st5);

        // Метод first() возвращает первый элемент множества
        treeSet.first();

        // Метод last() возвращает последний элемент множетсва
        treeSet.last();

        // Метод headSet() возвращает все элементы, которые меньше чем элемент в параметре
        treeSet.headSet(st3);

        // Метод tailSet() возвращает все элементы, которые больше чем элемент в параметре
        treeSet.tailSet(st3);

        // Метод subSet() возвращает все элементы, которые больше первого в параметре и меньше второго
        treeSet.subSet(st4, st3);
    }
}
