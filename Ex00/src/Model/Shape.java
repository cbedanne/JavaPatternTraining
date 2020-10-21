package Model;

public abstract class Shape {

    private Point origin;

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    abstract double area();

    public String getColor(){
        return this.color;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }


}
