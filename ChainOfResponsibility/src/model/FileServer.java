package model;

public class FileServer extends Node {

    public FileServer(String address) {
        super(address);
    }

    @Override
    public void handle(Packet packet) {
        System.out.println( "File server at adress " + this.getAddress() + " handle packet with content " + packet.getContents());
    }
}
