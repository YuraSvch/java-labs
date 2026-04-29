package lab6;

public class CreditAccount extends BankAccount {
    // Додані два нові поля
    private double creditLimit; 
    private double interestRate; 

    public CreditAccount(String name, String accountNumber, double balance, double creditLimit, double interestRate) {
        super(name, accountNumber, balance);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    // Перевизначений метод виведення даних
    @Override
    public void displayData() {
        System.out.println("=== КРЕДИТНИЙ РАХУНОК ===");
        super.displayData(); // Викликаємо метод батька
        System.out.println("Кредитний ліміт: " + creditLimit + " грн.");
        System.out.println("Відсоткова ставка: " + interestRate + "%");
        System.out.println("Доступний баланс (сальдо + ліміт): " + (balance + creditLimit) + " грн.");
    }
}