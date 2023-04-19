package Inheritance;

public class Scottish extends Cat {
    private String name;
    public Scottish (String name, int age, String owner) {
        super(age, owner);
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name + " Age " + getAge() + " Owner " + getOwner();
    }

    // Перезапишем метод equals для сравнения объектов
    @Override
    public boolean equals(Object obj) {
        // Сравним ссылки на случай если нам передали ссылки указывающие на один объект
        if (this == obj) {
            return true;
        }
        // Если нам передали null, мы точно должны вернуть false
        if (obj == null) {
            return false;
        }
        // Проверяем действительно ли нам передали объекты класса Scottish
        // С помощью метода класса Object - getClass()
        if (getClass() == obj.getClass()) {
            // Производим приведение типов для возможности использовать поля и методы класса объекта obj
            Scottish outsideObject = (Scottish) obj;
            // Сравниваем значения полей текущего класса со значениями полей класса переданного в параметр метода
            // Ссылочные типы данных String сравниваем с помощью метода equals(), так как он перезаписан для класса String
            return  name.equals(outsideObject.name)
            // Примитивные численные типы данных int сравниваем с помощью простого оператора равенства
                    && getAge() == outsideObject.getAge()
                    && getOwner().equals(outsideObject.getOwner());
        }
        return false;
    }
}
