package lab4;

public class Lab4_Task3 {
    public void execute() {
        double[] realNumbers = {1.5, -2.5, 4.0, 3.2, 10.1}; 
        double sum = 0;
        
        for (int i = 0; i < realNumbers.length; i++) {
            sum += realNumbers[i];
        }
        System.out.println("Масив дійсних чисел: [1.5, -2.5, 4.0, 3.2, 10.1]");
        System.out.println("Сума елементів масиву: " + sum);
    }
}