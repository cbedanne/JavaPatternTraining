package Model;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ArrayList<Shape> shapes=new ArrayList<>();
        shapes.add(new Rectangle(4d,5d,"Red"));
        shapes.add(new Rectangle(10d,20d,"Blue"));
        shapes.add(new Circle (5d, "Green"));
        shapes.add(new Circle (100d, "White"));

        for (Shape shape:shapes) {
            System.out.println(" Area : " + shape.area() + "  --  Color : " + shape.getColor() + "  --  Type : " + shape.getClass());
        }

    }
}
