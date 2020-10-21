package Model;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height,Double width) {
        this.height=height;
        this.width=width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public Double area(){
        return height*width;
    }


}
