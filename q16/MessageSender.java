import java.net.*;

public class MessageSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = "Ping".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), 6000);
        socket.send(packet);
        System.out.println("Sent: Ping");
        socket.close();
    }
}