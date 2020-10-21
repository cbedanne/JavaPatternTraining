package Model;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width, String color) {
        this.height=height;
        this.width=width;
        this.setColor(color);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area(){
        return height*width;
    }


}
