import java.io.*;
import java.net.*;
import java.util.*;
public class CookiePolicyExample {
 public static void main(String[] args) throws Exception 
 {
Scanner sc=new Scanner(System.in);
System.out.println("enter the url:");
 String urlString = sc.next();
 CookieManager cookieManager = new CookieManager();
 if(urlString.endsWith(".gov") ||urlString.endsWith(".gov.in"))
 { 
 cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_NONE);
 System.out.println("No cookie is stored for this website");
 }
 else
 {
 cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
 }
 CookieHandler.setDefault(cookieManager);
 URL u = new URI(urlString).toURL();
 BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
 String readLine;
 while ((readLine = in.readLine()) != null) 
 {} 
 in.close();
 CookieStore cookieStore = cookieManager.getCookieStore();
 List<HttpCookie> cookies = cookieStore.getCookies();
 int cookieIdx = 0;
 for (HttpCookie ck : cookies) {
 System.out.println("------ Cookie." + ++cookieIdx + " -------");
 System.out.println("Cookie name: " + ck.getName());
 System.out.println("Domain: " + ck.getDomain());
 System.out.println("Is secured: " + ck.getSecure());
 System.out.println("Cookie value: " + ck.getValue());
 }
 }}
