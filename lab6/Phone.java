package lab6;

public class Phone {
    String number;
    String model;
    double weight;

    // Конструктор з 3 параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор з 2 параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // Конструктор без параметрів
    public Phone() {
    }

    // Метод receiveCall з одним параметром
    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    // Перевантажений метод receiveCall з двома параметрами
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " (Номер: " + callerNumber + ")");
    }

    public String getNumber() {
        return number;
    }

    // Метод зі змінною кількістю аргументів
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Надсилання повідомлення на номери:");
        for (String num : phoneNumbers) {
            System.out.println(num);
        }
    }
}