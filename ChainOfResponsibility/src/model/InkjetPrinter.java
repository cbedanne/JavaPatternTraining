package model;

public class InkjetPrinter  implements PrinterStrategy {

    public InkjetPrinter() {
    }

    @Override
    public void print(String content) {
        System.out.println(" " + content + " from " + this.getClass().getSimpleName() );
    }
}
