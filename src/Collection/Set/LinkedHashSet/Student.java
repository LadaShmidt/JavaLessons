package Collection.Set.LinkedHashSet;
/*
    LinkedHashSet является наследником HashSet. Хранит информацию о порядке добавления элементов.
    Производительность методов немного ниже чем у методов HashSet.
    В основе LinkedHashSet лежит HashMap. У элементов данного HashMap ключи это элементы LinkedHashSet,
    а значения это константа-заглушка.
*/
public class Student {
    String name;
    int age;
    int course;

    Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + course;
    }
}
