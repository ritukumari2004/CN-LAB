import java.io.*;
import java.net.*;

public class Test {
    public static void main(String[] args) {
        String hostname = "www.example.com";
        int port = 80;

        try {
            // Create a socket
            Socket socket = new Socket(hostname, port);

            // Get local address
            InetAddress localAddress = socket.getLocalAddress();
            int localPort = socket.getLocalPort();

            // Get remote address
            InetAddress remoteAddress = socket.getInetAddress();
            int remotePort = socket.getPort();

            // Print local and remote address and port information
            System.out.println("Local IP address: " + localAddress);
            System.out.println("Local port: " + localPort);
            System.out.println("Remote IP address: " + remoteAddress);
            System.out.println("Remote port: " + remotePort);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            // Print the stack trace for debugging purposes
            e.printStackTrace();
        }
    }
}
