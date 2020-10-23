package model;

public abstract class PacketHandler extends LanComponent{
    public PacketHandler(String address) {
        super(address);
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
    public void send(Packet packet) {
        this.getNextComponent().receive(packet);
    }

    public abstract void handle (Packet packet);
}
