package lab4;

public class Lab4_Task2 {
    public void execute() {
        int[] array = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.print("Перебір циклом while: ");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        System.out.print("Перебір циклом for: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        System.out.print("Цикл while (тільки непарні індекси): ");
        int k = 1;
        while (k < array.length) {
            System.out.print(array[k] + " ");
            k += 2;
        }
        System.out.println();

        System.out.print("Цикл for (тільки парні індекси): ");
        for (int m = 0; m < array.length; m += 2) {
            System.out.print(array[m] + " ");
        }
        System.out.println();

        System.out.print("Зворотній порядок: ");
        for (int n = array.length - 1; n >= 0; n--) {
            System.out.print(array[n] + " ");
        }
        System.out.println();
    }
}