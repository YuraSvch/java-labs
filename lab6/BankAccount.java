package lab6;

public class BankAccount {
    protected String name;
    protected String accountNumber;
    protected double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Рахунок поповнено на " + amount + " грн.");
        } else {
            System.out.println("Сума поповнення має бути більшою за нуль.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Знято " + amount + " грн.");
        } else {
            System.out.println("Помилка зняття: недостатньо коштів або некоректна сума.");
        }
    }

    public void displayData() {
        System.out.println("Клієнт: " + name);
        System.out.println("Номер рахунку: " + accountNumber);
        System.out.println("Сальдо: " + balance + " грн.");
    }
}