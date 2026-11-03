import java.net.InetAddress;

public class IPInfo {
    public static void main(String[] args) throws Exception {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Host name  : " + local.getHostName());
        System.out.println("IP address : " + local.getHostAddress());
    }
}