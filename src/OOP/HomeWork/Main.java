package OOP.HomeWork;
import OOP.HomeWork.service.ConsoleService;
import OOP.HomeWork.entity.Account;
import OOP.HomeWork.entity.Bill;
import OOP.HomeWork.entity.Person;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ConsoleService consoleService = new ConsoleService();

        Account accountSergey = new Account(
                new Person("Sergey", "Sergey", "+9999999999"),
                new Bill(1000));

        Account accountLada = new Account(
                new Person("Lada", "Shmidt", "+8888888888"),
                new Bill(500));

        ArrayList<Account> accountList = new ArrayList<>(Arrays.asList(accountSergey, accountLada));

        consoleService.consoleService(accountList);
    }
}
