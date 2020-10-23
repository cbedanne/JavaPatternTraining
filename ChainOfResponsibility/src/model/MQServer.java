package model;

public class MQServer extends PacketHandler {

    public MQServer(String address) {
        super(address);
    }

    @Override
    public void handle(Packet packet) {
        System.out.println( "MQ server at adress " + this.getAddress() + " handle packet with content " + packet.getContents());
    }
}
