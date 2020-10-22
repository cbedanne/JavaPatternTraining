package model;

public class LaserPrinter implements PrinterStrategy {

    private final String name;

    public LaserPrinter(String name) {
        this.name=name;
    }

    @Override
    public void print(String content) {
        System.out.println(" " + content + " from " + name );
    }
}
