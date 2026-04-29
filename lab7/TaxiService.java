package lab7;

import java.util.ArrayList;

public class TaxiService {
    public static void main(String[] args) {
        ArrayList<Car> taxiFleet = new ArrayList<>();

        // 1. Створення 10 автомобілів
        for (int i = 1; i <= 10; i++) {
            taxiFleet.add(new Car("Brand_" + i, 100.0, new Driver("Driver_" + i, 20 + i, i), 10000.0, 2010 + i));
        }

        System.out.println("--- ПОЧАТКОВИЙ СТАН АВТОПАРКУ ---");
        printFleetStatus(taxiFleet);

        // 2. Ремонт мотору половині автопарку (5 машин) та нові водії
        for (int i = 0; i < taxiFleet.size() / 2; i++) {
            Car car = taxiFleet.get(i);
            car.setPower(car.getPower() * 1.10); // +10% потужності
            car.setDriver(new Driver("New_Pro_Driver_" + i, 35, 10)); // Новий водій
        }

        // 3. Кожна друга машина: +10% потужності та +5% ціни
        for (int i = 0; i < taxiFleet.size(); i += 2) {
            Car car = taxiFleet.get(i);
            car.setPower(car.getPower() * 1.10);
            car.setPrice(car.getPrice() * 1.05);
        }

        // 4. Перевірка досвіду ВСІХ водіїв
        for (Car car : taxiFleet) {
            Driver d = car.getDriver();
            if (d.getExperience() < 5 && d.getAge() > 25) {
                d.setExperience(d.getExperience() + 1);
            }
        }

        System.out.println("\n--- СТАН АВТОПАРКУ ПІСЛЯ ВСІХ ЗМІН ---");
        printFleetStatus(taxiFleet);

        // 5. Виклик хелпера для рандомного замовлення
        TaxiHelper.processOrder(taxiFleet);
    }

    // Допоміжний метод для зручного виведення даних у консоль
    private static void printFleetStatus(ArrayList<Car> fleet) {
        for (Car car : fleet) {
            System.out.printf("Марка: %-9s | Потужність: %-6.1f | Ціна: %-7.0f | Рік: %d | Водій: %s (Досвід: %d)\n",
                    car.getBrand(), car.getPower(), car.getPrice(), car.getYear(), 
                    car.getDriver().getName(), car.getDriver().getExperience());
        }
    }
}