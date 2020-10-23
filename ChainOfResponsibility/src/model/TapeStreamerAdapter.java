package model;

public class TapeStreamerAdapter extends Node implements PacketHandlerToTapeStreamerAdapter {


    private TapeStreamer adaptee;

    public TapeStreamerAdapter(String address) {
        super(address);
    }

    @Override
    public void handle(Packet packet) {
        this.adaptee.stream(packet, this.getAddress());
    }

    @Override
    public void setAdaptee(TapeStreamer tapeStreamer) {
        this.adaptee=tapeStreamer;
    }


}
