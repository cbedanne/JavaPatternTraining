package Model;

public class Client {

    public static void main(String[] args) {
        Rectangle rec1=new Rectangle(4D,8D);
        System.out.println(rec1.area());
        rec1.setColor("Red");
        System.out.println(rec1.getColor());
    }
}
