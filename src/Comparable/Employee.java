package Comparable;

import java.util.Objects;

/*
 * Интерфейс Comparable в Java используется для определения порядка сравнения объектов.
 * Это означает, что класс, который реализует интерфейс Comparable, может сравниваться с другими объектами этого же класса.

 * Интерфейс Comparable имеет один метод, который называется compareTo().
 * Этот метод принимает один аргумент - объект того же класса, что и объект, который вызывает метод.
 * Метод возвращает отрицательное целое число, ноль или положительное целое число, в зависимости от того,
 * Какой объект должен быть первым в порядке сортировки. Если возвращаемое значение отрицательное,
 * То текущий объект должен быть предшествующим в порядке сортировки. Если возвращаемое значение равно нулю, то объекты равны.
 * Если возвращаемое значение положительное, то текущий объект должен быть последующим в порядке сортировки.
 *
 * Интерфейс Comparable следует использовать для настройки стандартной сортировки по умолчанию, сортировки которая будет использоваться чаще всего.
 */
public class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    // Пример реализации метода compareTo интерфейса Comparable
    @Override
    public int compareTo(Employee anotherEmp) {
        return this.id-anotherEmp.id;
    }
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
