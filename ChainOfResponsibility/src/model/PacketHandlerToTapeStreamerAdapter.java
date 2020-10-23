package model;

public interface PacketHandlerToTapeStreamerAdapter{
    public void handle(Packet packet);
    public void setAdaptee(TapeStreamer tapeStreamer);
}
