package model;

public class LaserPrinter implements PrinterStrategy {

    public LaserPrinter() {
    }

    @Override
    public void print(String content) {
        System.out.println(" " + content + " from " + this.getClass().getSimpleName() );
    }
}
