package OOP.HomeWork.service;
import OOP.HomeWork.entity.Account;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleService {
    Scanner inputInt = new Scanner(System.in);
    Scanner inputLine = new Scanner(System.in);
    TransactionService billService = new TransactionService();
    private boolean isDoneNumber = false;
    private boolean isDoneOperation = false;
    private boolean isDoneAccountTo = false;
    private boolean isDoneTransferSum = false;
    private String accountNumber;
    private String accountNumberTo;
    private int operation;
    private int sum;
    private Account account;
    private Account accountTo;
    public void consoleService(ArrayList<Account> accountList) {

        while(!isDoneNumber) {
            System.out.println("Введите номер телефона:");
            accountNumber = inputLine.nextLine();
            for (Account account: accountList) {
                if (accountNumber.equals(account.getPerson().getPhoneNumber())) {
                    this.account = account;
                    isDoneNumber = true;
                }
            }
            if (isDoneNumber == false) {
                System.out.println("Аккаунт с таким номером не найден!");
            }
        }

        while(!isDoneOperation) {
            System.out.println("Выберите операцию: 1 - Показать баланс, 2 - Пополнить счет, 3 - Снять деньги со счета, 4 - Перевод денег на другой счет, 5 - Завершить");
            operation = inputInt.nextInt();

            switch(operation) {
                case 1:
                    System.out.println("Ваш текущий баланс составляет:" + account.getBill().getAmount() + " тенге");
                    break;

                case 2:
                    System.out.println("Введите сумму на которую вы хотите пополнить счет:");
                    sum = inputInt.nextInt();
                    billService.depositService(account, sum);
                    break;
                case 3:
                    System.out.println("Введите сумму которую вы хотите снять со счета:");
                    sum = inputInt.nextInt();
                    billService.paymentService(account, sum);
                    break;
                case 4:
                    while(!isDoneAccountTo) {
                        System.out.println("Введите номер телефона получателя:");
                        accountNumberTo = inputLine.nextLine();
                        for (Account accountTo: accountList) {
                            if (accountNumberTo.equals(accountTo.getPerson().getPhoneNumber()) && !accountNumberTo.equals(accountNumber)) {
                                this.accountTo = accountTo;
                                isDoneAccountTo = true;
                            }
                        }
                        if (isDoneAccountTo == false) {
                            System.out.println("Такого клиента не существует");
                        }
                    }
                    while(!isDoneTransferSum) {
                        System.out.println("Введите сумму которую хотите перевести:");
                        sum = inputInt.nextInt();
                        billService.moneyTransfer(account,accountTo,sum);
                        break;
                    }
                    isDoneAccountTo = false;
                    break;
                case 5:
                    System.out.println("Программа завершена!");
                    isDoneOperation = true;
                    break;
                default:
                    System.out.println("Такой команды не существует!");
            }
        }
    }
}
