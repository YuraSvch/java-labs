package lab7;

public class Car {
    private String brand;
    private double power;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, double power, Driver driver, double price, int year) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() { return brand; }
    
    public double getPower() { return power; }
    public void setPower(double power) { this.power = power; }
    
    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public int getYear() { return year; }
}