package Inheritance;
/* Насследование это еще один принцип объектно ориентированного программирования (ООП)
 * Наследование позволяет строить новые классы на базе существующих, добавляя в них
 * Новую функциональность или переопределяя существующую
 * С помощью наследования можно использовать методы и поля класса родителя
 * Суперкласс - класс родитель - тот класс который наследуется
 * Сабкласс - дочерний класс - тот класс который наследует
 */
/* Method overriding это возможность реализовать метод так,
 * Чтобы он имел идентичную сигнатуру с методом класса-предка, но предоставлял иное поведение,
 * Обязательным условием для overriding методов является
 * Одинаковый или менее строгий access modifier чем у суперкласса,
 * Одинаковое имя методов и количество параметров
 * Методы должны быть non-static, non-final, non-private
 */

// Добавление класса родителя к классу потомку осуществляется с помощью ключевого слова extends
public class Cat {
    private int age;
    private String owner;

    public Cat (int age, String owner) {
        this.age = age;
        this.owner = owner;
    }
    public void sayMeow(){
        System.out.println("Meow");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
