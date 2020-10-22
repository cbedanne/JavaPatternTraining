package model;

public class PrintServer extends Node {

    public PrintServer(String address) {
        super(address);
    }

    public void print(String message) {
        System.out.println("Printing : " + message + " from printerServer " + this.getAddress());
    }

    @Override
    public void receive(Packet packet) {
        if (this.getAddress()==packet.getDestinationAdress()) {
            print(packet.getContents());
        }
        else
        {
            this.getNextComponent().receive(packet);
        }
    }


}
