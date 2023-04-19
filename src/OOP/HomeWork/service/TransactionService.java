package OOP.HomeWork.service;
import OOP.HomeWork.entity.Account;
public class TransactionService {
    public void depositService (Account account, int sum) {
        int balance = account.getBill().getAmount();
        if (sum > 0) {
            account.getBill().setAmount(balance + sum);
            System.out.println("Счет успешно пополнен!");
            System.out.println("Текущий баланс составляет " + account.getBill().getAmount() + " тенге");
        } else {
            System.out.println("Минимальная сумма пополнения 1 тенге");
        }
    }

    public void paymentService(Account account, int sum) {
        int balance = account.getBill().getAmount();
        if (balance >= sum) {
            account.getBill().setAmount(balance - sum);
            System.out.println("Деньги успешно сняты со счета!");
            System.out.println("Текущий баланс составляет " + account.getBill().getAmount() + " тенге");
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public void moneyTransfer(Account accountFrom, Account accountTo, int sum) {
        int balanceFrom = accountFrom.getBill().getAmount();
        int balanceTo = accountTo.getBill().getAmount();
        if (balanceFrom >= sum) {
            accountFrom.getBill().setAmount(balanceFrom-sum);
            accountTo.getBill().setAmount(balanceTo+sum);
            System.out.println("Перевод успешно совершен!");
            System.out.println("Текущий баланс составляет " + accountFrom.getBill().getAmount() + " тенге");
        } else {
            System.out.println("Недостаточно средств!");
        }
    }
}
