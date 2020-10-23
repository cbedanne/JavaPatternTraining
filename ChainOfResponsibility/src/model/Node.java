package model;

public class Node extends PacketHandler {

    public Node(String address) {
        super(address);
    }

    @Override
    public void handle(Packet packet) {
        System.out.println( "Node with adress " + this.getAddress() + " can do nothing with packet " + packet.getContents());
    }
}
