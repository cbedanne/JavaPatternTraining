package Model;

public class Circle extends Shape {

    private Double radius;

    public Circle (Double radius) {
        this.radius=radius;
    }

    @Override
    Double area() {
        return Math.PI*radius*radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
