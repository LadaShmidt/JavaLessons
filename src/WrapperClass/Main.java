package WrapperClass;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Autoboxing - конвертация примитивных типов данных в соответствующий wrapper класс
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);

        // Unboxing - конвертирование объекта типа wrapper класс в соответствующий примитивный тип данных
        int a1 = list.get(0);

        // Метод parse() конвертирует значение типа String в соответствующий примитивный тип данных
        String s1 = "6";
        int a2 = Integer.parseInt(s1);

        // Метод valueOf() создает новый объект wrapper класса  того типа, на котором данный метод был вызван
        String s2 = "30";
        Integer i1 = Integer.valueOf(s2);
    }
}
