package model;

public class InkjetPrinter  implements PrinterStrategy {
    private String name;

    public InkjetPrinter(String name) {
        this.name = name;
    }



    @Override
    public void print(String content) {
        System.out.println(" " + content + " from " + name );
    }
}
