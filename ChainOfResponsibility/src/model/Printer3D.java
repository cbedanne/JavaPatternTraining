package model;

public class Printer3D implements PrinterStrategy {

    public Printer3D() {
    }

    @Override
    public void print(String content) {
        System.out.println(" " + content + " from " + this.getClass().getSimpleName() );
    }
}
