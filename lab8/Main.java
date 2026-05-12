package lab8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Перевірка наявності необхідних параметрів командного рядка
        if (args.length < 3) {
            System.out.println("Помилка: Недостатньо параметрів командного рядка.");
            System.out.println("Використання: java Main <ім'я_файлу.txt> <початок_діапазону_b1> <кінець_діапазону_b2>");
            return;
        }

        String fileName = args[0];
        int b1, b2;

        try {
            b1 = Integer.parseInt(args[1]);
            b2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Помилка: Межі діапазону повинні бути цілими числами.");
            return;
        }

        File file = new File(fileName);

        try {
            // Перевірка існування файлу та його створення за потреби
            if (file.exists()) {
                System.out.println("Файл " + fileName + " вже існує. Запис буде здійснено в нього.");
            } else {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("Файл " + fileName + " було успішно створено.");
                }
            }

            // Запис випадкових чисел у файл за допомогою FileWriter
            FileWriter writer = new FileWriter(file);
            Random random = new Random();
            int numbersCount = 10; // Кількість чисел для генерації

            for (int i = 0; i < numbersCount; i++) {
                // Генерація числа за заданою формулою
                int randNum = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(randNum + " ");
            }
            writer.close(); // Закриття потоку виведення обов'язкове
            System.out.println("Запис у файл завершено успішно.");

            // Читання інформації з файлу за допомогою FileReader та вивід на консоль
            System.out.println("\nВміст файлу " + fileName + ":");
            FileReader reader = new FileReader(file);
            int character;
            
            // Зчитування посимвольно, поки не буде досягнуто кінець файлу (-1)
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            reader.close(); // Закриття потоку введення обов'язкове

        } catch (IOException e) {
            System.out.println("Сталася помилка вводу/виводу: " + e.getMessage());
        }
    }
}