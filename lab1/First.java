package lab1;

public class First {
    public static void main(String[] args) {

        int[] numbers = {10, 2, 5, 8, 12, 3, 7, 1, 4, 6};
        
        long sum = 0;
        long diff = numbers[0];
        long mult = 1;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            mult *= numbers[i];
            if (i > 0) diff -= numbers[i];
        }

        System.out.println("Завдання 1:");
        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + diff);
        System.out.println("Множення: " + mult);
        System.out.println("Ділення: " + (double)numbers[0]/numbers[1]/numbers[2]/numbers[3]/numbers[4]/numbers[5]/numbers[6]/numbers[7]/numbers[8]/numbers[9]);
        System.out.println("--------------------");

        String[] words = {"I", "know", "it", "but", "I", "can", "not", "confirm", "it"};
        System.out.println("Завдання 2:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println("\n--------------------");

        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
            users[i].age = 18 + i;
            users[i].weight = 60.0 + i * 2;
            users[i].height = 1.60 + i * 0.03;
        }

        int totalAge = 0;
        double totalWeight = 0, totalHeight = 0;

        for (User u : users) {
            totalAge += u.age;
            totalWeight += u.weight;
            totalHeight += u.height;
        }

        System.out.println("Завдання 3:");
        System.out.println("Сума віку: " + totalAge);
        System.out.printf("Сума ваги: %.2f\n", totalWeight);
        System.out.printf("Сума зросту: %.2f\n", totalHeight);
        System.out.println("--------------------");

        Car[] cars = new Car[10];
        double[] volumes = {2.0, 1.6, 3.0, 1.4, 2.5, 1.2, 2.2, 1.8, 4.0, 1.0};
        double[] powers = {150, 110, 250, 90, 200, 75, 170, 140, 400, 60};

        double totalVol = 0, totalPower = 0;

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].engineVolume = volumes[i];
            cars[i].horsePower = powers[i];
            
            totalVol += cars[i].engineVolume;
            totalPower += cars[i].horsePower;
        }

        System.out.println("Завдання 4:");
        System.out.println("Сума об'ємів: " + totalVol);
        System.out.println("Сума потужностей: " + totalPower);
        System.out.println("--------------------");

        int number = 412;
        int reversed = 0;
        System.out.println("Завдання 5:");
        System.out.print("Число " + number + " навпаки буде: ");
        
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 1 + digit;
            number /= 10;
        }
        System.out.println(reversed);
    }
}