package Methods.toString;
/*
 * Метод toString() в Java используется для получения текстового представления объекта.
 * Он определен в классе Object, который является базовым классом для всех классов в Java.
 * Метод не принимает аргументов и возвращает строку, представляющую текущий объект.
 * По умолчанию метод toString() возвращает имя_класса@число
 * И для корректного вывода объекта на экран, он должен быть перезаписан
*/
public class Times {
    String name;
    int age;

    Times(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Animal's name " + name + " and animal's age " + age;
    }
}
