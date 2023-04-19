package Itarable.ListIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
    Класс ListIterator в Java является подклассом интерфейса Iterator и расширяет его возможности.
    Он используется для обхода элементов списка (List) и позволяет выполнять различные действия,
    Такие как добавление, замена и удаление элементов в процессе обхода.
*/

public class Main {
    public static void main(String[] args) {
        String string = "madam";
        List<Character> list = new ArrayList<>();

        for(char c: string.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
