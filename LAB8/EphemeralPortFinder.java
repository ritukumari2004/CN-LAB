import java.io.IOException;
import java.net.Socket;

public class EphemeralPortFinder {
    public static void main(String[] args) {
        try {
            // Step 1: Establish Connection to a Remote Server
            Socket socket = new Socket("example.com", 80);

            // Step 2: Retrieve Local Ephemeral Port
            int localPort = socket.getLocalPort();

            // Step 3: Display Ephemeral Port
            System.out.println("The local ephemeral port used for this connection is: " + localPort);

            // Step 4: Close Connection
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
