package Model;

public class Circle extends Shape {

    private Double radius;

    @Override
    Double area() {
        return 3.14*radius*radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
