package Lambda.Predicate;
import java.util.ArrayList;
import java.util.function.Predicate;
/*
    Predicate это функциональный интерфейс, который принимает один аргумент и возвращает значение типа boolean.
    Он определен в пакете java.util.function и называется Predicate.
    Предикат используется для определения, удовлетворяет ли объект определенному условию.
*/
public class Employee {
    private String name;
    private String department;
    private Integer salary;

    public static void filterOfEmployee (ArrayList<Employee> employeeArrayList, Predicate<Employee> predicate) {
        employeeArrayList.forEach(employee -> {
            if(predicate.test(employee)) {
                System.out.println(employee);
            }
        });
    }
    @Override
    public String toString() {
        return "Name: " + name + ", department: " + department + ", salary: " + salary;
    }

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
