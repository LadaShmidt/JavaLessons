package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

/*
    Метод collect() используется для сбора элементов потока в коллекцию или другую структуру данных.
*/
public class Collect {      
    public static void main(String[] args) {
        Employee emp1 = new Employee("Oleg", 2000, "IT");
        Employee emp2 = new Employee("Ivan", 5000, "Economy");
        Employee emp3 = new Employee("Maria", 7000, "Development");
        Employee emp4 = new Employee("Victor", 6000, "IT");
        Employee emp5 = new Employee("Sergey", 3000, "Driver");

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        // Метод groupingBy() это метод, который используется для группировки элементов потока по заданному критерию.
        // Сгруппируем работников по отделам
        Map<String, List<Employee>> map1 = employees.stream().map(element -> {
            element.setName(element.getName().toUpperCase());
            return element;
        }).collect(Collectors.groupingBy(element -> element.getDepartment()));

        for(Map.Entry<String, List<Employee>> entry: map1.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

        System.out.println();

        // Метод partitioningBy() используется для разделения элементов потока на две группы по заданному критерию.
        // Разделим работников по зарплате больше 5000 и меньше
        Map<Boolean, List<Employee>> map2 = employees.stream().collect(Collectors.partitioningBy(element-> element.getSalary() >= 5000));

        for(Map.Entry<Boolean, List <Employee>> entry: map2.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
    }
}
class Employee{
    private String name;
    private int salary;
    private String department;
    Employee (String name, int age, String department) {
        this.name = name;
        this.salary = age;
        this.department = department;
    }
    public String toString(){
        return name + " " + salary + " " + department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}