import java.net.InetAddress;
import java.net.UnknownHostException;
public class GetIPAddress {
    public static void main(String[] args) {
        try{
            InetAddress ipv4 = InetAddress.getLocalHost();
            System.out.println("My IP address:\n"+ipv4.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
