package edu.najah.it.capp.asd.intf;

import edu.najah.it.capp.asd.intf.Protocol;

public class Ftp implements Protocol {

    private static Protocol instance;


    public Ftp() {
        System.out.println("Creating a new FTP insatnce");
    }

    public static Protocol getInsatnce() {
        if(instance == null) {
            instance = new Ftp();
        }
        return instance;
    }
    @Override
    public boolean release() {
        instance = null;
        return true;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending message from FTP :: " + message);

    }

}
