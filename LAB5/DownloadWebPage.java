import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;

public class DownloadWebPage {
    public static void download(String webpage) {
        try {
            // Create a URL object
            URL url = new URL(webpage);

            // Create a BufferedReader to read the webpage
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // Create a BufferedWriter to write the webpage to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter("Download.html"));

            // Read the webpage line by line
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }

            // Close the BufferedReader and BufferedWriter
            reader.close();
            writer.close();

            System.out.println("Successfully downloaded the webpage.");
        } catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        } catch (IOException ie) {
            System.out.println("IOException raised");
        }
    }

    public static void main(String[] args) throws IOException {
        String url = "https://www.example.com";
        download(url);
    }
}
