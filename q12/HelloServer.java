import java.net.*;

public class HelloServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Waiting for client...");
        Socket client = server.accept();
        System.out.println("Client connected");
        client.close();
        server.close();
    }
}