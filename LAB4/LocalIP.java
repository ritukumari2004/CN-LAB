import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalIP {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Your current IP address : " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Cannot determine localhost IP");
        }
    }
}
