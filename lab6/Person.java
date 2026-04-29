package lab6;

public class Person {
    String fullName;
    int age;

    // Конструктор без параметрів
    public Person() {
        this.fullName = "Невідомий";
        this.age = 0;
    }

    // Конструктор з параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " йде.");
    }

    public void talk() {
        System.out.println(fullName + " говорить.");
    }
}