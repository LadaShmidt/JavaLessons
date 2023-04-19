package Lambda.SomeMethods;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(3);
        intList.add(1);
        intList.add(2);

        // Метод forEach()
        intList.forEach(e -> System.out.println(e));

        // Сортировка массива по возрастанию
        intList.sort((x,y) -> x.compareTo(y));
        System.out.println(intList);

        // Сортировка массива по убыванию
        intList.sort((x,y) -> -x.compareTo(y));
        System.out.println(intList);
    }
}
