package test;

import model.*;

public class Client {

    public static void main(String[] args) {

        LanComponent ws=new WorkStation("A1");
        LanComponent n1=new Node("A2");
        LanComponent ps1=new PrintServer("A3");
        LanComponent n2=new Node("A4");
        LanComponent ps2=new PrintServer("A5");

        ws.setNextComponent(n1);
        n1.setNextComponent(ps1);
        ps1.setNextComponent(n2);
        n2.setNextComponent(ps2);

        ((WorkStation) ws).originate(new Packet("A3","Message"));
        ((WorkStation) ws).originate(new Packet("A5","Other Message"));

    }

}
