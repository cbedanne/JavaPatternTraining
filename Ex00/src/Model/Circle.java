package Model;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color) {
        this.radius=radius;
        this.setColor(color);
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
