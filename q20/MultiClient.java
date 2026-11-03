import java.io.*;
import java.net.*;

public class MultiClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5002);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("Hello from " + (args.length > 0 ? args[0] : "client"));
        s.close();
    }
}