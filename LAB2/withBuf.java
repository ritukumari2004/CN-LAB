import java.io.*;
public class withBuf {
 public static void main(String[] args) {
 String filePath = "C:\\Users\\RITU\\Desktop\\CN GEANY\\LAB2\\File.txt"; 
 long startTime = System.currentTimeMillis(); 
 try (InputStream inputStream = new BufferedInputStream(new FileInputStream(filePath))) {
 int bytesRead;
 byte[] buffer = new byte[1024]; 
 while ((bytesRead = inputStream.read(buffer)) != -1){
 }
 } catch (IOException e) {
 e.printStackTrace();
 }
 long endTime = System.currentTimeMillis();
 long duration = endTime - startTime;
 
 System.out.println("Time taken with buffering: " + duration + " milliseconds");
 }
}
