
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public class ipVersionCheck {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("2409:4089:1e91:3722:871:e41f:d2e2:5b45");
            if (address instanceof Inet6Address) {
                System.out.println("IPv6");
            } else if (address instanceof Inet4Address) {
                System.out.println("IPv4");
            }
        } catch (Exception e) {
            System.out.println("Some Error Occurred");
        }
    }
}
