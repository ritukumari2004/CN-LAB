import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test_ip_website {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the website name:");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            InetAddress ip = InetAddress.getByName(name);
            System.out.println("The IP address of " + name + " is: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Website not found");
        }
    }
}
