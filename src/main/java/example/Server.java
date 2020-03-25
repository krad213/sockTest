package example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void listen(int port) throws IOException {
        try (
                ServerSocket serverSocket = new ServerSocket(port);
                Socket clientSocket = serverSocket.accept();
                final InputStream in = clientSocket.getInputStream()
        ) {
            in.transferTo(System.out);
        }
    }
}
