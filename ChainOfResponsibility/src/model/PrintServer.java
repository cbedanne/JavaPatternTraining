package model;

public class PrintServer extends Node {

    private PrinterStrategy printerType;

    public PrintServer(String address, PrinterStrategy printerType) {
        super(address);
        this.printerType=printerType;
    }

    @Override
    public void handle(Packet packet) {
        System.out.println("From printer " + this.getAddress()+  "  Printing : " );
        this.printerType.print(packet.getContents());
    }
}
