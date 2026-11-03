import java.io.*;
import java.net.URL;

public class WebReader {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://example.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = in.readLine()) != null)
            System.out.println(line);
        in.close();
    }
}