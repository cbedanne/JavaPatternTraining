package model;

public class Node extends PacketHandler {

    public Node(String address) {
        super(address);
    }

    @Override
    public void send(Packet packet) {
        this.getNextComponent().receive(packet);
    }

    @Override
    public void receive(Packet packet) {
        if (this.getAddress().equals(packet.getDestinationAdress())) {
            handle(packet);
        }
        else
        {
            send(packet);
        }
    }

    @Override
    public void handle(Packet packet) {
        System.out.println( "Node with adress " + this.getAddress() + " can do nothing with packet " + packet.getContents());
    }
}
