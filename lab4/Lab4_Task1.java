package lab4;

public class Lab4_Task1 {
    public void execute() {
        int[] evenNumbers = new int[50]; 
        int[] oddNumbers = new int[50];  

        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = i * 2; 
            oddNumbers[i] = i * 2 + 1;
        }
        
        System.out.println("Масиви успішно створені та заповнені.");
        System.out.println("Парні числа (приклад): перший = " + evenNumbers[0] + ", останній = " + evenNumbers[49]);
        System.out.println("Непарні числа (приклад): перший = " + oddNumbers[0] + ", останній = " + oddNumbers[49]);
    }
}