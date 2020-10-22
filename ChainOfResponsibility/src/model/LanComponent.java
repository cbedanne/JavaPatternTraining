package model;

public abstract class LanComponent {

    private String address;

    private LanComponent nextComponent;

    public LanComponent(String address){
        this.address=address;
    };

    public abstract void send(Packet message);

    public abstract void receive(Packet message);

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LanComponent getNextComponent() {
        return nextComponent;
    }

    public void setNextComponent(LanComponent nextComponent) {
        this.nextComponent = nextComponent;
    }

}
