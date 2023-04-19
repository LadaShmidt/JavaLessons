package Methods.Equals;

import java.util.Objects;

/*
 * Метод equals() в Java используется для сравнения объектов на равенство.
 * Он определен в классе Object, который является базовым классом для всех классов в Java.
 * По умолчанию метод equals() в классе object сравнивает ссылки на объекты
 * И для корректного сравнения объектов между собой, он должен быть перезаписан.
 *
 * Если вы перезаписываете метод equals(), всегда используется в его параметре data type Object
 *
 * Правильно и логично перезаписанный метод equals() должен обладать следующими свойствами:
 * Симметричность - для non-null ссылочных переменных a и b, a.equals(b) возвращает true если b.equals(a) возвращает true
 * Рефлексивность - для non-null ссылочной переменной а, а.equals(a) всегда должно возвращать true
 * Транзитивность - для non-null ссылочных переменных a, b и с, если a.equals(b) и b.equals(c) возвращает true, то a.equals(c) тоже должно возвращать true
 * Постоянство - для non-null ссылочных переменных a и b, неоднократный вызов a.equals(b) должен возвращать или только true, или только false
 * Для non-null ссылочной переменной а, a.equals(null) всегда должно возвращать false
 *
*/
public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    // Пример перезаписи метода equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }
}
