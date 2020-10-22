package model;

public class Packet {

    private String destinationAddress;
    private String contents;

    public Packet(String destination, String content ) {
        this.destinationAddress=destination;
        this.contents = content;
    }

    public String getDestinationAdress() {
        return destinationAddress;
    }

    public void setDestinationAdress(String destinationAdress) {
        this.destinationAddress = destinationAdress;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
