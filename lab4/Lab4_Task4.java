package lab4;

public class Lab4_Task4 {
    public void execute() {
        int[] array = {5, 8, -13, 20, 7, -4, 11};
        
        System.out.print("Початковий масив: ");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = -array[i];
            }
        }

        System.out.print("Масив після зміни знаків непарних елементів: ");
        printArray(array);
        
    }
    
    private void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}