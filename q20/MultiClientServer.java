import java.io.*;
import java.net.*;

public class MultiClientServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5002);
        System.out.println("MultiClientServer on port 5002...");
        while (true) {
            Socket client = server.accept();
            new Thread(new ClientHandler(client), "Client-Thread-" + client.getPort()).start();
        }
    }
}

class ClientHandler implements Runnable {
    private final Socket socket;
    ClientHandler(Socket socket) { this.socket = socket; }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = in.readLine();
            System.out.println("[" + Thread.currentThread().getName() + "] " + msg);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}