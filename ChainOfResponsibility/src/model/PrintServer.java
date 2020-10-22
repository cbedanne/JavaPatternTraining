package model;

public class PrintServer extends Node {

    private PrinterStrategy printerType;

    public PrintServer(String address, PrinterStrategy printerType) {
        super(address);
        this.printerType=printerType;
    }

    public void print(String message) {
        System.out.println("From printer " + this.getAddress()+  "  Printing : " );
        this.printerType.print(message);
    }

    @Override
    public void receive(Packet packet) {
        if (this.getAddress().equals(packet.getDestinationAdress())) {
            print(packet.getContents());
        }
        else
        {
           send(packet);
        }
    }


}
