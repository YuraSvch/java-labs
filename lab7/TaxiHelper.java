package lab7;

import java.util.ArrayList;
import java.util.Random;

public class TaxiHelper {
    public static void processOrder(ArrayList<Car> cars) {
        Random rand = new Random();
        Car randomCar = cars.get(rand.nextInt(cars.size())); 
        
        System.out.println("\n--- НОВЕ ЗАМОВЛЕННЯ ---");
        System.out.println("Автомобіль марки " + randomCar.getBrand() + 
                           " з водієм " + randomCar.getDriver().getName() + 
                           " виїхав за вами");
        
        arriveAtLocation(randomCar);
    }

    public static void arriveAtLocation(Car car) {
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце");
    }
}
