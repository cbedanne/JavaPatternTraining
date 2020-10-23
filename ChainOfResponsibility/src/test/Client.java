package test;

import model.*;

public class Client {

    public static void main(String[] args) {

        LanComponent ws=new WorkStation("A1");
        LanComponent n1=new Node("A2");
        LanComponent mq1=new MQServer("A8");
        LanComponent ts1=new TapeStreamerAdapter("A10");
        LanComponent ps1=new PrintServer("A3", new InkjetPrinter());
        LanComponent fs2=new FileServer("A9");
        LanComponent n2=new Node("A4");
        LanComponent ts2=new TapeStreamerAdapter("A11");
        LanComponent ps2=new PrintServer("A5",new LaserPrinter());
        LanComponent ps3=new PrintServer("A6",new Printer3D());
        LanComponent fs1=new FileServer("A7");

        ((TapeStreamerAdapter)ts1).setAdaptee(new TapeStreamer());
        ((TapeStreamerAdapter)ts2).setAdaptee(new TapeStreamer());

        ws.setNextComponent(n1);
        n1.setNextComponent(mq1);
        mq1.setNextComponent(ts1);
        ts1.setNextComponent(ps1);
        ps1.setNextComponent(fs2);
        fs2.setNextComponent(n2);
        n2.setNextComponent(ts2);
        ts2.setNextComponent(ps2);
        ps2.setNextComponent(ps3);
        ps3.setNextComponent(fs1);
        fs1.setNextComponent(ws);

        ((WorkStation) ws).originate(new Packet("A3","Inkjet message"));
        ((WorkStation) ws).originate(new Packet("A5","Laser Message"));
        ((WorkStation) ws).originate(new Packet("A6","3D Message"));
        ((WorkStation) ws).originate(new Packet("A2","'NodeDestinationMessage'"));
        ((WorkStation) ws).originate(new Packet("A7","'FileServerMessage'"));
        ((WorkStation) ws).originate(new Packet("A8","'MQServerMessage'"));
        ((WorkStation) ws).originate(new Packet("A9","'FileServerMessage'"));
        ((WorkStation) ws).originate(new Packet("A10","'TapeStreamerMessage'"));
        ((WorkStation) ws).originate(new Packet("A11","'TapeStreamerMessage'"));

    }

}
