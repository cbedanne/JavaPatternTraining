package model;

public class TapeStreamer {

    public TapeStreamer() {
    }

    public void stream(Packet packet, String address) {
        System.out.println(" Packet streaming from tape streamer with adress " + address);
    }
}
