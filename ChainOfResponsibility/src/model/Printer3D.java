package model;

public class Printer3D implements PrinterStrategy {

    private final String name;

    public Printer3D(String name) {
        this.name=name;
    }

    @Override
    public void print(String content) {
        System.out.println(" " + content + " from " + name );
    }
}
