package Model;

public abstract class Shape {

    private Point origin;

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    abstract Double area();

    public String getColor(){
        return this.color;
    }

}
