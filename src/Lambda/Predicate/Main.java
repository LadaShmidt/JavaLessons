package Lambda.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

import static Lambda.Predicate.Employee.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        Employee emp1 = new Employee("Alex", "IT",500);
        Employee emp2 = new Employee("Masha", "NYPD",10000);
        Employee emp3 = new Employee("Max", "Max",700);
        Employee emp4 = new Employee("Egor", "FBI",7000);

        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);
        employeeArrayList.add(emp4);

        // Выведем на экран всех работников из отдела IT с зарплатой больше 200
        filterOfEmployee(employeeArrayList, employee -> employee.getDepartment().equals("IT") && employee.getSalary() > 200);
        // Выведем на экран всех работников чье имя начинается на "Е" и чья зарплата не равна 450
        filterOfEmployee(employeeArrayList, employee -> employee.getName().startsWith("E") && employee.getSalary() != 450);
        // Выведем на экран всех работников чье имя совпадает с названием отдела
        filterOfEmployee(employeeArrayList, employee -> employee.getName().equals(employee.getDepartment()));

        // Далее рассмотрим некоторые нефункциональные методы интерфейса Predicate:

        // Метод removeIf() удаляет из списка все элементы, которые удовлетворяют условиям в теле метода
        employeeArrayList.removeIf(element -> element.getSalary() < 1000);

        // Метод and() возвращает объекты, которые прошли обе проверки
        Predicate<Employee> p1 = employee -> employee.getDepartment().equals("IT");
        Predicate<Employee> p2 = employee -> employee.getSalary() > 200;
        filterOfEmployee(employeeArrayList, p1.and(p2));

        // Метод or() возвращает объекты, которые прошли хотя бы одну из двух проверок
        filterOfEmployee(employeeArrayList, p1.or(p2));

        // Метод negate() возвращает объекты, которые противоположны тому условию, на котором вызван метод
        filterOfEmployee(employeeArrayList, p1.negate());
    }
}
