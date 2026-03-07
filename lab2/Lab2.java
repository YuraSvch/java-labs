package lab2;

import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Lab2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("1. Розв'язок квадратного рівняння ax^2 + bx + c = 0");
        boolean isValid = false; 
        
        while (!isValid) {
            try {
                System.out.print("Введіть a: "); double a = s.nextDouble();
                System.out.print("Введіть b: "); double b = s.nextDouble();
                System.out.print("Введіть c: "); double c = s.nextDouble();
                
                double d = Math.pow(b, 2) - 4 * a * c;
                
                if (a == 0) {
                    System.out.println("Це не квадратне рівняння (a = 0).");
                } else if (d > 0) {
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.printf("Два корені: x1 = %.3f, x2 = %.3f\n", x1, x2);
                } else if (d == 0) {
                    double x1 = -b / (2 * a);
                    System.out.printf("Один корінь: x = %.3f\n", x1);
                } else {
                    System.out.println("Дійсних коренів немає.");
                }

                isValid = true; 
                
            } catch (InputMismatchException e) {
                System.out.println("Помилка: Ви ввели не число! Спробуйте ще раз.\n");
                s.nextLine();
            } 
        }

        System.out.println("\n2. Визначення квадранта");
        System.out.print("Введіть x: "); double xCoord = s.nextDouble();
        System.out.print("Введіть y: "); double yCoord = s.nextDouble();
        
        if (xCoord > 0 && yCoord > 0) System.out.println("Точка у I квадранті");
        else if (xCoord < 0 && yCoord > 0) System.out.println("Точка у II квадранті");
        else if (xCoord < 0 && yCoord < 0) System.out.println("Точка у III квадранті");
        else if (xCoord > 0 && yCoord < 0) System.out.println("Точка у IV квадранті");
        else System.out.println("Точка лежить на осі координат.");

        System.out.println("\n3. Перевірка числа");
        System.out.print("Введіть ціле число: "); int num = s.nextInt();
        boolean isTwoDigit = Math.abs(num) >= 10 && Math.abs(num) <= 99; 
        boolean isEven = num % 2 == 0;
        
        if (isTwoDigit && isEven) {
            System.out.println("Число є двозначним і парним.");
        } else {
            System.out.println("Число не відповідає заданим умовам.");
        }

        System.out.println("\n4.1. Обчислення f(x)");
        System.out.print("Введіть x: "); double x = s.nextDouble();
        double f;
        
        if (x < 0) {
            f = Math.exp(x) + Math.exp(-Math.pow(x, 2)); 
        } else if (x >= 0 && x <= 1) {
            f = Math.cos(2 * x) + 2 * Math.sin(3 * x) + 1;
        } else {
            f = Math.abs(Math.cos(x) - 13);
        }
        System.out.printf("Результат f(x) = %.4f\n", f);
        
        System.out.println("\n4.2. Пора року за місяцем");
        System.out.print("Введіть номер місяця (1-12): "); int month = s.nextInt();
        
        switch (month) {
            case 12: case 1: case 2:
                System.out.println("Пора року: Зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Пора року: Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Пора року: Літо");
                break;
            case 9: case 10: case 11:
                System.out.println("Пора року: Осінь");
                break;
            default:
                System.out.println("Помилка: Невірний номер місяця.");
        }
    } 
}