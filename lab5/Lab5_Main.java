package lab5;

import java.util.Scanner;

public class Lab5_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Завдання 1: Площа прямокутника ===");
        Lab5_RectArea rectArea = new Lab5_RectArea();
        double length = readDouble(scanner, "Введіть довжину прямокутника: ");
        double width = readDouble(scanner, "Введіть ширину прямокутника: ");
        try {
            double area = rectArea.calculateArea(length, width);
            System.out.println("Площа прямокутника: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка логіки: " + e.getMessage());
        }

        System.out.println("\n=== Завдання 2: Найменше з трьох чисел ===");
        Lab5_MinOfThree minAnalyzer = new Lab5_MinOfThree();
        int a = readInt(scanner, "Введіть перше число: ");
        int b = readInt(scanner, "Введіть друге число: ");
        int c = readInt(scanner, "Введіть третє число: ");
        
        // Тепер метод лише рахує, а виводимо ми самі
        int minResult = minAnalyzer.findMin(a, b, c);
        System.out.println("Найменше число: " + minResult);

        System.out.println("\n=== Завдання 3 та 4: Робота з масивом ===");
        int size = readInt(scanner, "Введіть розмір масиву: ");
        while (size <= 0) {
            System.out.println("Помилка: Розмір масиву має бути більшим за 0!");
            size = readInt(scanner, "Введіть розмір масиву ще раз: ");
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = readInt(scanner, "Введіть елемент [" + i + "]: ");
        }

        // Отримуємо відформатований рядок і друкуємо його
        Lab5_PrintArray arrayFormatter = new Lab5_PrintArray();
        String arrayOutput = arrayFormatter.formatArray(array);
        System.out.println(arrayOutput);

        Lab5_MaxInArray arrayAnalyzer = new Lab5_MaxInArray();
        int maxResult = arrayAnalyzer.findMax(array);
        System.out.println("Найбільше число в масиві: " + maxResult);

        scanner.close();
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть ціле число.");
            }
        }
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String input = scanner.nextLine().trim().replace(",", ".");
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть число (наприклад 5.5).");
            }
        }
    }
}