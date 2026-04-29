package lab6;

class Shape {
    private double volume;

    public double getVolume() {
        return volume;
    }
    
    // Захищений метод для встановлення об'єму спадкоємцями
    protected void setVolume(double volume) {
        this.volume = volume;
    }
}

class SolidOfRevolution extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }
    
    protected void setRadius(double radius) {
        this.radius = radius;
    }
}

class Pyramid extends Shape {
    private double s; // площа основи
    private double h; // висота

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        setVolume((1.0 / 3.0) * s * h); // Формула об'єму піраміди
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        setRadius(radius);
        this.height = height;
        setVolume(Math.PI * radius * radius * height); // Формула об'єму циліндра
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        setRadius(radius);
        setVolume((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)); // Формула об'єму кулі
    }
}