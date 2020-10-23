package test;

import model.*;

public class Client {

    public static void main(String[] args) {

        LanComponent ws=new WorkStation("A1");
        LanComponent n1=new Node("A2");
        LanComponent mq1=new MQServer("A8");
        LanComponent ps1=new PrintServer("A3", new InkjetPrinter("Inkjet"));
        LanComponent fs2=new FileServer("A9");
        LanComponent n2=new Node("A4");
        LanComponent ps2=new PrintServer("A5",new LaserPrinter("Laser"));
        LanComponent ps3=new PrintServer("A6",new Printer3D("3D"));
        LanComponent fs1=new FileServer("A7");

        ws.setNextComponent(n1);
        n1.setNextComponent(mq1);
        mq1.setNextComponent(ps1);
        ps1.setNextComponent(fs2);
        fs2.setNextComponent(n2);
        n2.setNextComponent(ps2);
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

    }

}
