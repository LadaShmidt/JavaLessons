package Itarable.Iterator;
import java.util.ArrayList;
import java.util.Iterator;

/*
   Iterator в Java представляет собой интерфейс, который используется для итерации (перебора) элементов в коллекции.
   Он позволяет перебирать элементы коллекции один за другим и осуществлять некоторые действия с каждым элементом в процессе перебора.
*/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

/*
         Для того чтобы использовать итератор, необходимо получить объект Iterator для конкретной коллекции.
         Например, для списка List можно получить итератор следующим образом:
*/

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

/*
        boolean hasNext(): возвращает true, если в коллекции еще есть элементы, которые можно перебрать.

        E next(): возвращает следующий элемент в коллекции. Если следующего элемента нет, выбрасывается исключение NoSuchElementException.

        void remove(): удаляет элемент, который был возвращен последним вызовом метода next(). Если элемент не может быть удален, выбрасывается исключение IllegalStateException
*/
    }
}
