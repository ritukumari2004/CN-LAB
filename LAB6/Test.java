import java.io.*;
import java.net.*;
import java.util.*;
public class Test {
public static void main (String[] args)throws Exception {
System.out.println("Enter the url:");
Scanner sc=new Scanner(System.in);
String website=sc.nextLine();
URL u = new URI(website).toURL();
String encoding = "ISO-8859-1";
URLConnection uc = u.openConnection();
String contentType = uc.getContentType();
int Start = contentType.indexOf("charset=");
if (Start != -1)
{
encoding = contentType.substring(Start + 8);
}
InputStreamReader in =new
InputStreamReader(uc.getInputStream(),encoding);
int c;
while ((c = in.read()) != -1)
{
System.out.print((char) c);
}
in.close();
}
}
