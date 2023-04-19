package Encapsulation;
/*
 * Инкапсуляция это один из принципов объектно ориентированного программирования (ООП)
 * Инкапсуляция в Java - это механизм, позволяющий скрыть внутреннюю реализацию класса
 * И предоставить доступ к его членам только через определенный интерфейс.
 *
 * В Java инкапсуляция достигается путем объявления полей класса как private
 * И предоставления публичных методов (геттеров и сеттеров), которые позволяют получать и изменять значения этих полей.
 *
 * Конструктор это метод класса, который инициализирует новый объект после его создания
 * В конструктор передают значение переменных, которые обязательно должны быть инициализированы
 */
public class Cat {
    private String name;
    private int age;
    private String owner;

    // Конструктор с аргументами выглядит следующим образом
    public Cat(String name){
        this.name = name;
    }

    // При помощи комбинаций клавиш alt+insert можно автоматически создать getter и setter методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
