package lab4;

public class Lab4_Main {
    public static void main(String[] args) {
        System.out.println("Початок Лабораторної роботи 4");

        System.out.println("\n--- Завдання 1 ---");
        Lab4_Task1 task1 = new Lab4_Task1();
        task1.execute();

        System.out.println("\n--- Завдання 2 ---");
        Lab4_Task2 task2 = new Lab4_Task2();
        task2.execute();

        System.out.println("\n--- Завдання 3 ---");
        Lab4_Task3 task3 = new Lab4_Task3();
        task3.execute();

        System.out.println("\n--- Завдання 4 ---");
        Lab4_Task4 task4 = new Lab4_Task4();
        task4.execute();
    }
}