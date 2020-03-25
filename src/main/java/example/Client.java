package example;

import java.io.*;
import java.net.Socket;

public class Client {
    public void connect(String ip, int port) throws IOException {
        try (
                Socket clientSocket = new Socket(ip, port);
                OutputStream socketOut = clientSocket.getOutputStream();
        ) {
            System.in.transferTo(socketOut);
        }
    }
}
