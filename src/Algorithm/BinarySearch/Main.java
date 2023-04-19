package Algorithm.BinarySearch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(20, "Alex", 2000);
        Employee employee2 = new Employee(15, "Bob", 3000);
        Employee employee3 = new Employee(20, "Bill", 7000);
        Employee employee4 = new Employee(01, "Maria", 5000);
        Employee employee5 = new Employee(100,"Maksim", 2000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Collections.sort(employeeList);

        int position = Collections.binarySearch(employeeList, new Employee(20, "Bill", 7000));

        System.out.println(position);
    }
}
