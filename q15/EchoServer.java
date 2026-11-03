import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5001);
        System.out.println("EchoServer on port 5001...");
        Socket client = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Received: " + line);
            out.println(line);
        }
        client.close();
        server.close();
    }
}