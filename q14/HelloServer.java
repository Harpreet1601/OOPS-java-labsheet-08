import java.io.*;
import java.net.*;

public class HelloServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Waiting for client...");
        Socket client = server.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String msg = in.readLine();
        System.out.println("Received from client: " + msg);

        client.close();
        server.close();
    }
}