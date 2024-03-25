import java.net.*;
import java.util.*;
class URISplitter {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the url");
String url=sc.nextLine();
try {
URI u = new URI(url);
System.out.println("The protocol is " + u.getScheme());
System.out.println("The user info is " + u.getUserInfo());
String host = u.getHost();
if (host != null) 
{
System.out.println("The host is " + host);
} 
else 
{
System.out.println("The host is null.");
}
System.out.println("The port is " + u.getPort());
System.out.println("The path is " + u.getPath());
System.out.println("The query string is " + u.getQuery());
} 
catch (URISyntaxException ex) 
{
System.err.println(ex);
}
}
}
