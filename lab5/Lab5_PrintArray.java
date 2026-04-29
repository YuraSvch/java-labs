package lab5;

import java.util.Arrays;

public class Lab5_PrintArray {
    public String formatArray(int[] array) {
        if (array == null) {
            return "Масив не ініціалізований (null).";
        }
        if (array.length == 0) {
            return "Масив порожній.";
        }
        return "Вміст масиву: " + Arrays.toString(array);
    }
}