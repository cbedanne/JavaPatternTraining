package Model;

public class Client {

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4D, 8D);
        System.out.println(rec1.area());
        rec1.setColor("Red");
        System.out.println(rec1.getColor());

        Circle circle1 = new Circle(5D);
        System.out.println(circle1.area());
        circle1.setColor("Blue");
        System.out.println(circle1.getColor());
    }
}
