package Polymorphism;
/*
 * Полиморфизм в Java - это способность объектов разных классов использовать одно и то же имя метода или оператора,
 * Но по-разному реагировать на этот вызов в зависимости от конкретной реализации метода в каждом из этих классов.
 * В Java полиморфизм достигается путем создания иерархии классов, которые наследуют методы и свойства от базовых
 * Классов и могут переопределять их, чтобы изменить поведение. Для вызова методов у объектов разных классов
 * Используется одно и то же имя метода, но конкретная реализация метода будет выбрана во время выполнения
 * В зависимости от типа объекта, на котором он вызывается.
 */

public interface Animal {
    void setOwner(String owner);
}