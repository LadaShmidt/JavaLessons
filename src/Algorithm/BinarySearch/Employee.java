package Algorithm.BinarySearch;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee anotherEmployee) {
        int result = this.id-anotherEmployee.id;
        if (result == 0) {
            return this.name.compareTo(anotherEmployee.name);
        } else {
            return result;
        }
    }
    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Salary: " + salary;
    }
}
