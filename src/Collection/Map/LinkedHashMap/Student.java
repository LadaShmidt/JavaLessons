package Collection.Map.LinkedHashMap;
/*
    LinkedHashMap является наследником HashMap. Хранит информацию о порядке добавления элементов
    или порядке их использования. Производительность методов немного ниже, чем у методов HashMap.
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
