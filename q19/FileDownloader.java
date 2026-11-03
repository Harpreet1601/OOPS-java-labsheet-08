import java.io.*;
import java.net.*;

public class FileDownloader {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com/sample.txt");
        URLConnection conn = url.openConnection();

        try (InputStream in = conn.getInputStream();
             FileOutputStream out = new FileOutputStream("sample.txt")) {
            byte[] buffer = new byte[4096];
            int n;
            while ((n = in.read(buffer)) != -1)
                out.write(buffer, 0, n);
        }
        System.out.println("Downloaded to sample.txt");
    }
}