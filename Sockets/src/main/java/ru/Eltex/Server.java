package ru.Eltex;

import java.util.Scanner;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] arg) {
        int port = 1808;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Wait a bit...");
            Socket socket = ss.accept();

            System.out.println("Connected!");
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String Str = null;
            Str = in.readUTF();
            System.out.println(Str);
            ss.close();
            socket.close();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}