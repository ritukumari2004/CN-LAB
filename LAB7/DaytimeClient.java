import java.io.*;
import java.net.*;

public class DaytimeClient {
    public static void main(String[] args) {
        String serverAddress = "time.nist.gov";
        int port = 13;

        try {
            // Open a connection to the server
            Socket socket = new Socket(serverAddress, port);

            // Create a BufferedReader to read the server's response
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Read the server's response and concatenate into a single string
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            // Print the entire server response
            System.out.println("Server Response: " + response.toString());

            // Close the socket
            socket.close();
        } catch (IOException e) {
            // Print the stack trace for debugging purposes
            e.printStackTrace();
        }
    }
}
