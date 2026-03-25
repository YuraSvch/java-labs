package lab3;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        
        // 1. Фраза 50 разів (for і while)
        String text = "Тестова фраза";
        for (int i = 0; i < 50; i++) {
            System.out.println(text);
        }
        int j = 0;
        while (j < 50) {
            System.out.println(text);
            j++;
        }

        // 2. Час (for) - 2 цикли
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.println(h + "h " + m + " min");
            }
        }

        // 3. Час (while) - 2 цикли
        int h_w = 0;
        while (h_w <= 2) {
            int m_w = 0;
            while (m_w <= 59) {
                System.out.println(h_w + "h " + m_w + " min");
                m_w++;
            }
            h_w++;
        }

        // 4. Час із секундами (for) - 2 цикли, секунди дорівнюють хвилинам за прикладом
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.println(h + "h " + m + " min " + m + " sec");
            }
        }

        // 5. Протабулювати функцію (Варіант 4: 0.1x^2 - x*cos(x))
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть нижню межу: ");
        double minLimit = scanner.nextDouble();
        System.out.print("Введіть верхню межу: ");
        double maxLimit = scanner.nextDouble();

        // Спосіб for
        int countFor = 0;
        for (double x = 0; x <= 2.01; x += 0.1) {
            double f = 0.1 * x * x - x * Math.cos(x);
            System.out.printf("x = %.1f, f(x) = %.4f\n", x, f);
            if (f >= minLimit && f <= maxLimit) countFor++;
        }
        if (countFor > 0) System.out.println("Кількість (for): " + countFor);
        else System.out.println("Значень немає.");

        // Спосіб while
        int countWhile = 0;
        double x_while = 0;
        while (x_while <= 2.01) {
            double f = 0.1 * x_while * x_while - x_while * Math.cos(x_while);
            System.out.printf("x = %.1f, f(x) = %.4f\n", x_while, f);
            if (f >= minLimit && f <= maxLimit) countWhile++;
            x_while += 0.1;
        }
        if (countWhile > 0) System.out.println("Кількість (while): " + countWhile);
        else System.out.println("Значень немає.");
        
        scanner.close();
    }
}