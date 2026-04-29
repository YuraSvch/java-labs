package lab6;

public class Lab6Runner {

    // Єдина точка входу
    public static void main(String[] args) {
        System.out.println("=== ПОЧАТОК ЛАБОРАТОРНОЇ РОБОТИ №6 ===\n");

        runTask1Person();
        runTask2Phone();
        runTask3Shape();
        runTask4Car();
        runTasks5And6Bank();

        System.out.println("=== ЛАБОРАТОРНУ РОБОТУ ЗАВЕРШЕНО ===");
    }

    // --- Метод для Завдання 1: Клас Person ---
    public static void runTask1Person() {
        System.out.println("--- ЗАВДАННЯ 1: Person ---");
        Person person1 = new Person(); 
        Person person2 = new Person("Юрій", 18); 

        person1.talk();
        person2.move();
        System.out.println("--------------------------\n");
    }

    // --- Метод для Завдання 2: Клас Phone ---
    public static void runTask2Phone() {
        System.out.println("--- ЗАВДАННЯ 2: Phone ---");
        Phone phone1 = new Phone("050-111-22-33", "Google Pixel 8", 187.0);
        Phone phone2 = new Phone("067-444-55-66", "iPhone 15");
        Phone phone3 = new Phone();

        System.out.println("Телефон 1: " + phone1.getNumber() + ", " + phone1.model + ", Вага: " + phone1.weight);
        System.out.println("Телефон 2: " + phone2.getNumber() + ", " + phone2.model + ", Вага: " + phone2.weight);
        System.out.println("Телефон 3: " + phone3.getNumber() + ", " + phone3.model + ", Вага: " + phone3.weight);

        phone1.receiveCall("Мама");
        phone2.receiveCall("Олексій", "099-999-99-99");

        phone1.sendMessage("063-123-45-67", "098-765-43-21");
        System.out.println("-------------------------\n");
    }

    // --- Метод для Завдання 3: Ієрархія Shape ---
    public static void runTask3Shape() {
        System.out.println("--- ЗАВДАННЯ 3: Shape ---");
        Pyramid pyramid = new Pyramid(15, 10);
        Cylinder cylinder = new Cylinder(5, 12);
        Ball ball = new Ball(7);

        System.out.println("Об'єм піраміди: " + pyramid.getVolume());
        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
        System.out.println("Об'єм кулі: " + ball.getVolume());
        System.out.println("-------------------------\n");
    }

    // --- Метод для Завдання 4: Абстрактний клас Car ---
    public static void runTask4Car() {
        System.out.println("--- ЗАВДАННЯ 4: Car ---");
        Sedan mySedan = new Sedan("Mazda 6", "Червоний", 240);
        Truck myTruck = new Truck("MAN TGX", "Синій", 110);

        mySedan.gas();
        mySedan.brake();

        myTruck.gas();
        myTruck.brake();
        System.out.println("-----------------------\n");
    }

    // --- Метод для Завдання 5.1 та 6: BankAccount ---
    public static void runTasks5And6Bank() {
        System.out.println("--- ЗАВДАННЯ 5.1 та 6: BankAccount ---");
        
        System.out.println("[Базовий рахунок]");
        BankAccount basicAcc = new BankAccount("Іван Петренко", "UA123456789", 5000);
        basicAcc.displayData();
        
        basicAcc.deposit(1500);
        basicAcc.withdraw(2000);
        System.out.println("Оновлений базовий рахунок:");
        basicAcc.displayData();

        System.out.println("\n[Кредитний рахунок - спадкоємець]");
        CreditAccount creditAcc = new CreditAccount("Олександр", "UA987654321", 1000, 15000, 3.5);
        creditAcc.displayData();
        
        System.out.println("--------------------------------------\n");
    }
}