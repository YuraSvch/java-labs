package lab5;

public class Lab5_RectArea {
    public double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Сторони прямокутника не можуть бути від'ємними.");
        }
        return length * width;
    }
}