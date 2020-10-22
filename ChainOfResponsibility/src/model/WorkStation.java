package model;

public class WorkStation extends Node {

    public WorkStation(String address) {
        super(address);
    }

    @Override
    public void receive(Packet packet) {
        System.out.println(" Destination no found");
    }

    public void originate(Packet packet) {
        this.send(packet);;
    }



}
