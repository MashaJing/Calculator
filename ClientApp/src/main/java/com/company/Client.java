package com.company;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] arg) {
        int serverPort = 1808;
        String address = "127.0.0.1";
        try {
            InetAddress ipAddress = InetAddress.getByName(address);
            Socket socket = new Socket(ipAddress, serverPort);
            System.out.println("Found'ya!");

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            Scanner Enter = new Scanner(System.in);
            String Str = null;
            System.out.println("Enter something plz");
            Str = Enter.next();
            out.writeUTF(Str);
            Str = in.readUTF();
            socket.close();
            System.out.println("I've got this line: " + Str);
        }
        catch (Exception x) {x.printStackTrace();}
    }
}
