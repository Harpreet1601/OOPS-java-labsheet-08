import java.net.*;

public class MessageReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6000);
        System.out.println("Waiting on UDP port 6000...");
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        System.out.println("Received: " + new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}